package com.amdocs.buyyourphonebackend.Controller;

import com.amdocs.buyyourphonebackend.model.Orders;
import com.amdocs.buyyourphonebackend.Services.OrderServicesImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@CrossOrigin("*")
@RequestMapping("api/buyphone")
public class OrderController {
    @Autowired
    private OrderServicesImple orderServicesImple;

    @PostMapping("/createOrder")
    public Map<String, Object> createOrder(@RequestBody Orders order) {

        Map<String, Object> response = new HashMap<String, Object>();
        response.put("orderDetail", orderServicesImple.createOrder(order));
        return response;
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<Object> getOrder(@PathVariable long id){
        return ResponseEntity.ok(orderServicesImple.getOrder(id));
    }

    @PutMapping("/add/{id}")
    public ResponseEntity<Object> addOrder(@PathVariable long id , @RequestBody Orders order){
        return ResponseEntity.ok(orderServicesImple.addOrder(id , order));
    }

    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<Orders> deleteOrder(@PathVariable long id){
        return new ResponseEntity<>(orderServicesImple.deleteOrder(id) , HttpStatus.NO_CONTENT);
    }

}







