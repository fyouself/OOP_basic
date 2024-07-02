package lesson1.expBank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Account> arraysList = new ArrayList<>();
        arraysList.add(new Account());
        arraysList.add(new DepositCart());
        arraysList.add(new CreditCart());

        for (int i=0; i<arraysList.size(); i++){
            arraysList.get(i).put(BigDecimal.valueOf(100));
            arraysList.get(i).take(BigDecimal.TEN);
            System.out.println(arraysList.get(i).toString());
        }






        }
    }
