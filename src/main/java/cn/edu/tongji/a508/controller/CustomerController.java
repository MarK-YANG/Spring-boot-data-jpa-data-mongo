package cn.edu.tongji.a508.controller;

import cn.edu.tongji.a508.domain.mongo.Customer;
import cn.edu.tongji.a508.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 7/11/17.
 */

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "Customer Controller";
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public ResponseEntity saveCustomer() {
        customerService.saveNewCustomer(new Customer("Mark", "Yang"));
        return new ResponseEntity(new Customer("Mark", "Yang"), HttpStatus.OK);
    }

    @RequestMapping(value = "json", method = RequestMethod.GET)
    public ResponseEntity findAllCustomers(){
        return new ResponseEntity(customerService.findAllCustomers(), HttpStatus.OK);
    }

}
