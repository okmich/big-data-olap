/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.logfile.reader.simulation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael.enudi
 */
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            printCmdUsage();
            System.exit(-1);
        }
        Map<String, String> arguments = parseCmdLine(args);
        File folder = new File(arguments.get("srcfolder"));
        if (!folder.exists() || !folder.isDirectory()) {
            throw new IllegalArgumentException("");
        }
        File[] files = folder.listFiles();

        KafkaSender kafkaSender = new KafkaSender(arguments.get("kafkaBroker"), arguments.get("topic"));
        for (File file : files) {
            try {
                new MainWorker(file, kafkaSender).start();
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //
    }

    private static Map<String, String> parseCmdLine(String[] args) {
        Map<String, String> params = new HashMap(args.length);

        for (String arg : args) {
            String[] parts = arg.split("=");
            if (parts.length == 1) {
                params.put(parts[0].substring(1), "1");
            } else if (parts.length > 1) {
                params.put(parts[0].substring(1), parts[1]);
            } else {
                printCmdUsage();
            }
        }

        return params;
    }

    private static void printCmdUsage() {
        String output = "Usage: -srcfolder=<source folder> -kafkaBroker=<kafka broker> -topic=<kafka topic>\n\n"
                + "\t-srcfolder     : where the log files to be transfer is located\n"
                + "\t-kafkabroker   : the kafak server address with port\n"
                + "\t-topic         : the topic to post kakfa messages to\n";

        System.out.println(output);
    }
}
