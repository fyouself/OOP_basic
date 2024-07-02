package lesson1.expBank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest2 {

    @Test
    void testNewAccount() {
        // Тестируем, что новый аккаунт имеет 0 средств
        Account account = new Account();
        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

}