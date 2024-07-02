package lesson1.expBank;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {


    @Test
    void testNewAccount() {
        // Тестируем, что новый аккаунт имеет 0 средств
        Account account = new Account();
        assertEquals(BigDecimal.ZERO, account.getAmount());
    }

    @Test
    void testPutAccount(){
        Account account = new Account();
        account.put(BigDecimal.valueOf(100));
        assertEquals(BigDecimal.valueOf(100),account.getAmount());

        account.put(BigDecimal.TEN);
        assertEquals(BigDecimal.valueOf(110),account.getAmount());


    }
}