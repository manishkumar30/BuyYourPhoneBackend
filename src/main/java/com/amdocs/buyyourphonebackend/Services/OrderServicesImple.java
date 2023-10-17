package com.amdocs.buyyourphonebackend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amdocs.buyyourphonebackend.Exception.ResourceNotFound;
import com.amdocs.buyyourphonebackend.model.Orders;
import com.amdocs.buyyourphonebackend.Repository.OrderRepository;

@Service
public class OrderServicesImple implements com.amdocs.buyyourphonebackend.Services.OrderServices{
    @Autowired
    private OrderRepository order_repository;


    @Override
    public Orders createOrder(Orders ord)
    {
        return order_repository.save(ord);
    }

    @Override
    public Orders getOrder(long id) {
        Orders ord =order_repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("Customer not Exit with id "+id));
        return ord;
    }

    @Override
    public Orders addOrder(long id, Orders ord) {
        Orders ordToUpdate = order_repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("User not Exit with id "+id));
        ordToUpdate.setAccessory_name(ord.getAccessory_name());
        ordToUpdate.setAccessory_price(ord.getAccessory_price());
        ordToUpdate.setAccessory_img(ord.getAccessory_img());
        ordToUpdate.setAccessory_dlv_time(ord.getAccessory_dlv_time());
        order_repository.save(ordToUpdate);

        return ordToUpdate;
    }

    @Override
    public Orders deleteOrder(long id) {
        Orders ord = order_repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("Order not Exit with id "+id));
        order_repository.delete(ord);

        return ord;
    }

}




