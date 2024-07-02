package ru.gb.lesson1;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void testTake() {
        CreditAccount account = new CreditAccount(BigDecimal.valueOf(0.01));
        account.put(BigDecimal.valueOf(200));

        account.take(BigDecimal.valueOf(100));
        assertEquals(0, BigDecimal.valueOf(99).compareTo(account.getAmount()));
    }

}