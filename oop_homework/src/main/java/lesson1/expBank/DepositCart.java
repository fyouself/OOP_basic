package lesson1.expBank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositCart extends Account {

    private LocalDate lastTake;

    public DepositCart() {
        super();
        lastTake = LocalDate.now().minusDays(2);
    }

    public DepositCart(BigDecimal account) {
        super(account);
        lastTake = LocalDate.now().minusDays(2);
    }

    public LocalDate getLastTake(){
        return lastTake;
    }

    @Override
    public void take(BigDecimal decrease) {
        if (LocalDate.now().minusDays(1).isAfter(lastTake)) {
            super.take(decrease);
            lastTake= LocalDate.now();
        } else { throw new IllegalArgumentException("Не прошел временной режим");
        }
    }
}
