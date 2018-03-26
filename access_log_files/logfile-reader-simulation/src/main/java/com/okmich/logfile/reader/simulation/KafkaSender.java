/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okmich.logfile.reader.simulation;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 *
 * @author michael.enudi
 */
public class KafkaSender {

    private final KafkaProducer<Long, String> kafkaProducer;
    private final String topic;
    private final AtomicLong counter;

    public KafkaSender(String brokerUrl, String topic) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", brokerUrl);
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        kafkaProducer = new KafkaProducer<>(properties);

        this.topic = topic;
        this.counter = new AtomicLong(0);
    }

    /**
     *
     * @param message
     */
    public void send(String message) {
        kafkaProducer.send(new ProducerRecord<>(this.topic, this.counter.incrementAndGet(), message));
        Logger.getLogger(KafkaSender.class.getName()).log(Level.INFO, message);
    }
}
