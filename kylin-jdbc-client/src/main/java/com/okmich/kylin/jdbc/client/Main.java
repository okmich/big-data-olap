/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.kylin.jdbc.client;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael.enudi
 */
public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            printUsage();
            System.exit(-1);
        }
        Map<String, String> argMap = parseArguments(args);
        String username = argMap.get("u");
        if (username == null) {
            username = "ADMIN";
        }

        String password = argMap.get("p");
        if (password == null) {
            password = "KYLIN";
        }
        String query = argMap.get("q");
        if (query == null) {
            System.out.println("Enter the query you want to execute: ");
            query = new Scanner(System.in).nextLine();
            if (query == null || query.trim().isEmpty()) {
                throw new IllegalArgumentException("Invalid query supplied");
            }
        }

        KylinClient kylinClient = new KylinClient(argMap.get("d"), username, password);
        try {
            kylinClient.runQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void printUsage() {
        StringBuilder sb = new StringBuilder("Usage is: \n");
        sb.append("java -jar ./kylin-jdbc-client -d=<db> [-u=<username>] [-p=<password>] [-q=<query>]");
        System.out.println(sb.toString());
    }

    private static Map<String, String> parseArguments(String[] args) {
        Map<String, String> params = new HashMap(args.length);

        for (int i = 1; i < args.length; i++) {
            String[] parts = args[0].split("=");
            if (parts.length == 1) {
                params.put(parts[0].substring(1), "1");
            } else if (parts.length > 1) {
                params.put(parts[0].substring(1), parts[1]);
            } else {
                printUsage();
            }
        }

        return params;
    }
}
