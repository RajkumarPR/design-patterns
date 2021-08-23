package com.design.principle.solid.lsp.bank;

import java.math.BigDecimal;

/**
 * Open/Close principle
 * --------------------
 * To understand the Liskov Substitution Principle, we must first understand the Open/Closed Principle.
 * <p>
 * The goal of the Open/Closed principle encourages us to design our software so we add new features only by adding new code.
 * When this is possible, we have loosely coupled, and thus easily maintainable applications.
 *
 * @author rajkumar
 */
public class BankingApp {

    public static void main(String[] args) {


        // No problem till FixedDepositAccount created
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(BigDecimal.valueOf(100.00));

        BankingAppWithdrawalService service = new BankingAppWithdrawalService(savingAccount);
        service.withdraw(BigDecimal.valueOf(100.00));

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(BigDecimal.valueOf(100.00));

        service = new BankingAppWithdrawalService(savingAccount);
        service.withdraw(BigDecimal.valueOf(100.00));
        // till here no problem


        // When we add  FixedDepositAccount class example which violates the LSP
        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();
        fixedTermDepositAccount.deposit(BigDecimal.valueOf(100.0));

        /**
         * One can't withdraw amount from the fixed deposit account
         */
        // BankingAppWithdrawalService service1 = new BankingAppWithdrawalService(fixedTermDepositAccount);
        // service1.withdraw(BigDecimal.valueOf(100.0));

        /**
         * Now lets fix this issue
         * Make Account abstract class to have only deposit method and create WithdrawalAccount class
         * which extends the account and have withdraw() methods. All withdrawal accounts will extend this class.
         */
        // We don't have withdraw method in BankingAppWithdrawalService
        BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(new SavingAccount());
        withdrawalService.deposit(BigDecimal.valueOf(2000.00));
        withdrawalService.withdraw(BigDecimal.valueOf(1000.00));

    }
}


