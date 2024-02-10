package com.example.demo.api;

import com.example.demo.db.Database;
import com.example.demo.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 2/9/2024
 * @project : demo
 */

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String createCustomer(
           @RequestBody RequestCustomerDto customerDto
    ){
        return Database.createCustomer(customerDto).toString();

    }
    @PutMapping
    public String updateCustomer(){return "updated Customer";}
    @DeleteMapping
    public String deleteCustomer(){return"delete Customer";}
    @GetMapping
    public String findCustomer(){return"findAll Customer";}
    @GetMapping("/list")
    public String getAllCustomer(){return"getAll Customer";}
}
