package com.design.patterns.structural.bridge.message;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("Sending text Message ...");
    }
}
