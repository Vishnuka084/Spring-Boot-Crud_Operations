package com.example.demo.api;

import com.example.demo.db.Database;
import com.example.demo.dto.request.RequestCustomerDto;
import com.example.demo.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<StandardResponse> createCustomer(
           @RequestBody RequestCustomerDto customerDto
    ){
        var savedData = Database.createCustomer(customerDto);
        return new ResponseEntity<>(
                new StandardResponse(201,"customer Saved!",savedData),
                HttpStatus.CREATED
        );
    }
    @PutMapping(params = "id")
    public ResponseEntity<StandardResponse>  updateCustomer(
        @RequestParam int id,
        @RequestBody RequestCustomerDto customerDto
    ) throws ClassNotFoundException {

        var savedData = Database.updateCustomer(customerDto,id);
        return new ResponseEntity<>(
                new StandardResponse(201,"customer updated!!",savedData),
                HttpStatus.CREATED
        );
    }


    @DeleteMapping
    public String deleteCustomer(){return"delete Customer";}


    @GetMapping("/{id}")
    public ResponseEntity<StandardResponse> findCustomer(@PathVariable int id) throws ClassNotFoundException {
        return new ResponseEntity<>(
                new StandardResponse(200,"customer Data!",Database.findCustomer(id)),
                HttpStatus.OK
        );
    }


    @GetMapping("/list")
    public String getAllCustomer(){return"getAll Customer";}
}
