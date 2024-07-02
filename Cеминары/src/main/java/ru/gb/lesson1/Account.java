package ru.gb.lesson1;

import java.math.BigDecimal;

public class Account {

    private static long counter = 0L;

    // Неограниченный дробный точный тип данных.
    private BigDecimal amount;

    public Account() {
        this(BigDecimal.ZERO);
    }

    public Account(BigDecimal amount) {
        checkArgumentPositive(amount);

        this.amount = amount;
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void put(BigDecimal increase) {
        checkArgumentPositive(increase);
        amount = amount.add(increase);
    }

    public void take(BigDecimal decrease) {
        checkArgumentPositive(decrease);

        if (amount.compareTo(decrease) >= 0) {
            amount = amount.subtract(decrease);
        } else {
            throw new IllegalStateException("Недостаточно средств");
        }
    }

    private void checkArgumentPositive(BigDecimal arg) {
        if (arg.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Аргумент должен быть положительным!");
        }
    }

}
