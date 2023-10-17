package com.amdocs.buyyourphonebackend.Repository;

import com.amdocs.buyyourphonebackend.Entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}