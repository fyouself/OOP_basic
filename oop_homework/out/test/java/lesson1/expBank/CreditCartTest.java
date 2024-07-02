package lesson1.expBank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CreditCartTest {

    @Test
    void testFillCreditCart(){

        CreditCart creditCart = new CreditCart(BigDecimal.TEN,BigDecimal.valueOf(0.1));
        assertEquals(BigDecimal.TEN,creditCart.getAmount());

    }
    @Test
    void testComissionCreditCart(){

        CreditCart creditCart = new CreditCart(BigDecimal.TEN,BigDecimal.valueOf(0.1));
        assertEquals(BigDecimal.valueOf(0.1),creditCart.getCommission());

    }


}