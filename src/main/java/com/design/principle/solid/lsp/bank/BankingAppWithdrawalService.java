package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {

    private WithdrawalAccount account;

    public BankingAppWithdrawalService(WithdrawalAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }

    public void  deposit(BigDecimal amount) {
        this.account.deposit(amount);
    }
}
