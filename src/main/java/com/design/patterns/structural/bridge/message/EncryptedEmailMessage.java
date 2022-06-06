package com.design.patterns.structural.bridge.message;

public class EncryptedEmailMessage extends Message{

    public EncryptedEmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
