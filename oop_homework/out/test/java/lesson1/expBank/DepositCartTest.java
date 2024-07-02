package lesson1.expBank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepositCartTest {

    @Test
    void takeNormTrafic(){
        DepositCart depositCart = new DepositCart(BigDecimal.valueOf(100));
        depositCart.take(BigDecimal.valueOf(10));
        assertEquals(0, depositCart.getLastTake().compareTo(LocalDate.now()));

    }

    @Test
    void takeViolationTrafic() {
        DepositCart depositCart = new DepositCart(BigDecimal.valueOf(100));
        depositCart.take(BigDecimal.TEN);
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                depositCart.take(BigDecimal.TEN);
            }
        });
        assertEquals(BigDecimal.valueOf(90), depositCart.getAmount());
    }
}