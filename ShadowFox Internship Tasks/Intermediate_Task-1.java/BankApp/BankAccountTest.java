package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Joel", "ACC123", "Canara", 0);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawSuccess() {
        account.withdraw(300);
        assertEquals(700, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawFailure() {
        account.withdraw(2000);
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    void testTransactionHistory() {
        account.deposit(100);
        account.withdraw(50);
        List<Transaction> history = account.getTransactionHistory();
        assertEquals(2, history.size());
    }
}
