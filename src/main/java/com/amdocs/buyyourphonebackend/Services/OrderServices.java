package com.amdocs.buyyourphonebackend.Services;

import com.amdocs.buyyourphonebackend.model.Orders;

public interface OrderServices {
    //
    Orders createOrder(Orders ord);
    Orders getOrder(long id);
    Orders addOrder(long id , Orders ord);
    Orders deleteOrder(long id);
//    List<Order> findCustomersByFamilyId(long family_id);
}
