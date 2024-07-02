package lesson1.expBank;

import java.math.BigDecimal;

public class CreditCart extends Account{

    private final BigDecimal commission;


    public CreditCart() {
        super();
        this.commission = BigDecimal.valueOf(0.01);
    }
    public CreditCart(BigDecimal commission){
        super();
        this.commission = commission;
    }
    public CreditCart(BigDecimal amount, BigDecimal commission){
        super(amount);
        this.commission = commission;
    }

    public BigDecimal getCommission(){
        return commission;
    }
}
