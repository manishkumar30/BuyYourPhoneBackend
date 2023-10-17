package com.amdocs.buyyourphonebackend.Repository;

import com.amdocs.buyyourphonebackend.Entity.Product;
import com.amdocs.buyyourphonebackend.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


    Product findByBrandAndModelAndColorAndSizeAndTypeAndPriceAndWarehouse(String brand, String model, String color, String size, String type, String price, Warehouse warehouse);
}


