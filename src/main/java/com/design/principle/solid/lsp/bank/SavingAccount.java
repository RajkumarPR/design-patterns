package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

public class SavingAccount extends WithdrawalAccount {
    /**
     * Update account with the amount specified in the deposit method
     *
     * @param amount
     */
    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Amount \'" + amount + "\' deposited to saving bank ");
    }

    /**
     * Reduces the balance of the account by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    @Override
    protected void withdraw(BigDecimal amount) {
        System.out.println("Amount \'" + amount + "\' withdrawn from saving bank ");

    }
}
