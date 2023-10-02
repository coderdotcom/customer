package com.krishnachaitanya.customer.service;

import com.krishnachaitanya.customer.dao.CustomerDAO;
import com.krishnachaitanya.customer.reward.CustomerReward;
import com.krishnachaitanya.customer.transaction.CustomerTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerService {
    CustomerDAO customerDAO;
    String name;

    @Autowired
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public List<CustomerTransaction> getAllTransactions() {
        return customerDAO.getTransactionList();
    }

    public List<CustomerTransaction> getTransactionsWithinThreeMonths() {
        int currentDate = LocalDate.now().getDayOfYear();
        List<CustomerTransaction> allTransactions = getAllTransactions();
        List<CustomerTransaction> skimmedTransactions = new ArrayList<>();
        for(CustomerTransaction eachTransaction : allTransactions) {
            if(currentDate - eachTransaction.getDate().getDayOfYear() <= 90) {
                skimmedTransactions.add(eachTransaction);
            }
        }
        return skimmedTransactions;
    }

    public CustomerReward getCustomerReward(String id) {
        for(CustomerTransaction eachCustomerTransaction : getTransactionsWithinThreeMonths()) {
            if(id.equals(eachCustomerTransaction.getId())) {
                return new CustomerReward(eachCustomerTransaction.getName(),
                        eachCustomerTransaction.getId(),
                        eachCustomerTransaction.getTotalAmount(),
                        getReward(eachCustomerTransaction.getTotalAmount()));
            }
        }
        return null;
    }

    public int getReward(int totalAmount) {
        int reward = 0;
        if(totalAmount>100) {
            int val = totalAmount-100;
            reward = (val*2)+50;
        } else if(totalAmount>50) {
            reward = totalAmount - 50;
        }
        return reward;
    }
}
