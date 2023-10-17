package com.amdocs.buyyourphonebackend.Controller;

import com.amdocs.buyyourphonebackend.Entity.Warehouse;
import com.amdocs.buyyourphonebackend.Repository.ProductRepository;
import com.amdocs.buyyourphonebackend.Repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController {
    @Autowired
    private WarehouseRepository warehouseRepository;

    @PostMapping
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
}


