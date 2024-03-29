package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

public abstract class WithdrawalAccount extends Account {

    /**
     * Reduces the balance of the account by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    protected abstract void withdraw(BigDecimal amount);


}
