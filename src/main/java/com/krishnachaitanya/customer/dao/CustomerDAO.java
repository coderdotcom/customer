package com.krishnachaitanya.customer.dao;

import com.krishnachaitanya.customer.transaction.CustomerTransaction;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDAO {
    private static List<CustomerTransaction> transactionList = new ArrayList<>();

    static {
        transactionList.add( new CustomerTransaction("John Doe", "001", LocalDate.of(2023,6, 30), 120));
        transactionList.add( new CustomerTransaction("Mike Adam", "002",LocalDate.of(2023,7,21), 75));
        transactionList.add( new CustomerTransaction("Philip David", "003",LocalDate.of(2023,7,10), 325));
        transactionList.add( new CustomerTransaction("Connor Calson", "004",LocalDate.of(2023,5,9), 213));
        transactionList.add( new CustomerTransaction("Toby Chad", "005",LocalDate.of(2023,9,1), 112));
        transactionList.add( new CustomerTransaction("Alex Smith", "006",LocalDate.of(2023,3,31), 557));
        transactionList.add( new CustomerTransaction("Jacob Ranon", "007",LocalDate.of(2023,9,3), 47));
        transactionList.add( new CustomerTransaction("Matthew Mitchell", "008",LocalDate.of(2023,8,9), 176));
        transactionList.add( new CustomerTransaction("Sam Brown", "009",LocalDate.of(2023,4,15), 225));
        transactionList.add( new CustomerTransaction("Gary Billiard Williams", "010",LocalDate.of(2023,7,29), 865));
    }

    public List<CustomerTransaction> getTransactionList() {
        return transactionList;
    }
}
