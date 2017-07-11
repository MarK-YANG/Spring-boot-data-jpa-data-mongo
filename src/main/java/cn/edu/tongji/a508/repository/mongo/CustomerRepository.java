package cn.edu.tongji.a508.repository.mongo;

import cn.edu.tongji.a508.domain.mongo.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mark on 7/11/17.
 */

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

    Customer findCustomerByFirstName(String firstName);

    List<Customer> findCustomersByLastName(String lastName);
}
