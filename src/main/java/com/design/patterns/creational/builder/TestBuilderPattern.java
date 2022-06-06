package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.bank.AccountType;
import com.design.patterns.creational.builder.bank.BankAccount;

public class TestBuilderPattern {

    public static void main(String[] args) {
        BankAccount account = BankAccount.builder(
                        12345678L,
                        "Rajkumar",
                        AccountType.SAVINGS)
                .withEmail("raju.raigonde@gmail.com")
                .withIsNewsLetter(Boolean.TRUE)
                .build();

        System.out.println("Bank Account holder name : " + account.getAccountHolderName());
        System.out.println("Bank Account number : " + account.getAccountNumber());
        System.out.println("Bank Account type : " + account.getAccountType().name());
        System.out.println("Bank is news letter obtained : " + account.isNewsletter());
        System.out.println("Bank Account holder email : " + account.getEmail());
    }
}
