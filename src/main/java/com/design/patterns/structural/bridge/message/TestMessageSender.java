package com.design.patterns.structural.bridge.message;

public class TestMessageSender {

    public static void main(String[] args) {

        Message textMessage = new TextMessage(new TextMessageSender());
        textMessage.send();

        Message emailMessage = new EmailMessage(new EmailMessageSender());
        emailMessage.send();

        Message encryptedMessage = new EncryptedEmailMessage(new EncryptedEmailMessageSender());
        encryptedMessage.send();

    }
}
