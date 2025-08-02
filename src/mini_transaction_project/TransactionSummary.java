package mini_transaction_project;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionSummary {

    public static void main(String[] args) {

        List<Transaction> transactionList = List.of(
                new Transaction("Food", 40.0),
                new Transaction("Entertainment", 50.0),
                new Transaction("Food", 80.0),
                new Transaction("Travel", 300.0),
                new Transaction("Entertainment", 35.5)
        );

        // Now I have the list of Transaction stored now I need to print the original list first

        System.out.println("********Below is the original list************");

        for(Transaction obj : transactionList){
            System.out.println(obj);
        }

        System.out.println("*********Below is the list separated by category*********");

        Map<String,Double> categoryList = transactionList.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        categoryList.forEach((cat,amt) -> System.out.println(cat+" -> "+amt));

    }
}
