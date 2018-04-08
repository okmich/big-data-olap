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
import java.io.RandomAccessFile;

/**
 *
 * @author michael.enudi
 */
public class MainWorker {

    private final File file;
    private final KafkaSender kafkaSender;
    private final int pointToBegin;
    private final int batchSize;

    public MainWorker(File file, KafkaSender kafkaSender, int startPoint, int batchSize) {
        this.file = file;
        this.kafkaSender = kafkaSender;
        this.pointToBegin = startPoint;
        this.batchSize = batchSize;
    }

    public void start() throws Exception {
        int i = 0; //line pointer
        BufferedReader br = new BufferedReader(new FileReader(file));
        Gson gson = new Gson();
        Log log;
        for (int p = 0; p < this.pointToBegin; p++) {
            br.readLine();
        }

        String line, json;
        while ((line = br.readLine()) != null && i < batchSize) {
            log = Log.fromLogEntry(line);
            if (log != null) {
                kafkaSender.send(gson.toJson(log));
            }
            i++;
        }
    }
}
