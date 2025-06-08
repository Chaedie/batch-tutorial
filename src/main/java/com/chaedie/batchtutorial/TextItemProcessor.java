package com.chaedie.batchtutorial;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class TextItemProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String message) throws Exception {
        String maskedMessage = message.replaceAll("\\d", "*");

        // System.out.println("message = " + message);
        // System.out.println("maskedMessage = " + maskedMessage);

        return maskedMessage;
    }
}
