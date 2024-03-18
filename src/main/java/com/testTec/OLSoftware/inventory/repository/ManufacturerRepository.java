package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.Manufacturers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author macru
 */

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturers, Integer> {
 
    Manufacturers findByName(String name);
     
}