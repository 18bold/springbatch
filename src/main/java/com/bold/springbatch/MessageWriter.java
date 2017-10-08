package com.bold.springbatch;

import com.bold.springbatch.domain.Message;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class MessageWriter implements ItemWriter<Message> {
    @Override
    public void write(List<? extends Message> items) throws Exception {
        System.out.println("Results:");
        for (Message item : items) {
            System.out.println(item.getContent());
        }
    }
}
