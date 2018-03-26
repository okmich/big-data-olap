/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.logfile.reader.simulation;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author michael.enudi
 */
public class MainWorker {

    private final File file;
    private final KafkaSender kafkaSender;

    public MainWorker(File file, KafkaSender kafkaSender) {
        this.file = file;
        this.kafkaSender = kafkaSender;
    }

    public void start() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        Gson gson = new Gson();
        Log log;

        String line, json;
        while ((line = br.readLine()) != null) {
            log = Log.fromLogEntry(line);
            if (log != null) {
                kafkaSender.send(gson.toJson(log));
            }
        }
    }
}
