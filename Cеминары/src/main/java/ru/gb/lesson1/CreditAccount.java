package ru.gb.lesson1;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private final BigDecimal commission;

    public CreditAccount() {
        super();
        this.commission = BigDecimal.valueOf(0.01);
    }

    public CreditAccount(BigDecimal commission) {
        super(commission);
        this.commission = commission;
    }

    @Override
    public void take(BigDecimal decrease) {
        // decrease * (1 + 0.01)
        super.take(decrease.multiply(BigDecimal.ONE.add(commission)));
    }

}
