package com.design.patterns.builder.bank;

public class BankAccount {

    private Long accountNumber;
    private String accountHolderName;
    private AccountType accountType;
    private Boolean isNewsletter;
    private String email;

    //The constructor that takes a builder from which it will create object
    //the access to this is only provided to builder
    private BankAccount(BankAccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.accountHolderName = builder.accountHolderName;
        this.accountType = builder.accountType;
        this.isNewsletter = builder.isNewsletter;
        this.email = builder.email;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Boolean isNewsletter() {
        return isNewsletter;
    }

    public String getEmail() {
        return email;
    }

    // Inner builder class
    public static class BankAccountBuilder {
        private Long accountNumber;
        private String accountHolderName;
        private AccountType accountType;
        private Boolean isNewsletter;
        private String email;

        // Any mandatory fields are required as arguments to the inner class's constructor
        // while the remaining optional fields can be specified using the setter methods
        public BankAccountBuilder(Long accountNumber, String accountHolderName, AccountType accountType) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.accountType = accountType;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withIsNewsLetter(Boolean isNewsLetter) {
            this.isNewsletter = isNewsLetter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
