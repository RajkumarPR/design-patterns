package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

public abstract class Account {

    /**
     * Update account with the amount specified in the deposit()
     *
     * @param amount
     */
    protected abstract void deposit(BigDecimal amount);

}
