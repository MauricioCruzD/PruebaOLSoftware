package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.States;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<States, String> {
    
    States findByName(String name);   
}
