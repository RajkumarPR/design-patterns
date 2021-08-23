package com.design.patterns.builder;

import com.design.patterns.builder.bank.AccountType;
import com.design.patterns.builder.bank.BankAccount;

public class TestBuilderPattern {

    public static void main(String[] args) {
        BankAccount account = new BankAccount
                .BankAccountBuilder(
                        12345678L,
                    "Rajkumar", AccountType.SAVINGS)
                .withEmail("raju.raigonde@gmail.com")
                .withIsNewsLetter(Boolean.TRUE)
                .build();

        System.out.println("Bank Account holder name : "+account.getAccountHolderName());
        System.out.println("Bank Account number : "+account.getAccountNumber());
        System.out.println("Bank Account type : "+account.getAccountType().name());
        System.out.println("Bank is news letter obtained : "+account.isNewsletter());
        System.out.println("Bank Account holder email : "+account.getEmail());
    }
}
