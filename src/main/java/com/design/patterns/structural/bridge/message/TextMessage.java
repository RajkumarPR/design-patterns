package com.design.patterns.structural.bridge.message;

public class TextMessage extends Message{


    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
