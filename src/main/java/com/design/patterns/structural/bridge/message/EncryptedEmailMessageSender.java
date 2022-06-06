package com.design.patterns.structural.bridge.message;

public class EncryptedEmailMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Sending encrypted message ... ");
    }
}
