package cn.edu.tongji.a508.service;

import cn.edu.tongji.a508.domain.mongo.Customer;
import cn.edu.tongji.a508.repository.mongo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by mark on 7/11/17.
 */

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Optional<Customer> findCustomerByFirstName(String firstName){
        return Optional.ofNullable(customerRepository.findCustomerByFirstName(firstName));
    }

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }
}
