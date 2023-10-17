package com.amdocs.buyyourphonebackend.Repository;

import com.amdocs.buyyourphonebackend.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}








//public interface Customer_repository extends JpaRepository<Customer_details, Long> {
//
//    @Query("SELECT u FROM Customer_details u WHERE u.family.family_id=?1")
//    List<Customer_details> findCustomersByFamilyId(long family_id);
//}
