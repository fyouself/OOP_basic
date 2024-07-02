package ru.gb.lesson1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DepositAccount extends Account {

    private LocalDate lastTake;

    public DepositAccount(BigDecimal amount) {
        super(amount);
    }

    public DepositAccount() {
        super();
        lastTake = LocalDate.now().minusMonths(2);
    }

    @Override
    public void take(BigDecimal decrease) {
        if (LocalDate.now().minusMonths(1).isAfter(lastTake)) {
            super.take(decrease);
            lastTake = LocalDate.now();
        } else {
            throw new IllegalArgumentException("Нельзя снять: не прошел ограничительный период");
        }
    }
}
