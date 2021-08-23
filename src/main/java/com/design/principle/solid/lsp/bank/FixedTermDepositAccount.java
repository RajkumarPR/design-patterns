package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    /**
     * Update account with the amount specified in the deposit method
     *
     * @param amount
     */
    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Amount "+amount+" deposited into fixed account");
    }

}
