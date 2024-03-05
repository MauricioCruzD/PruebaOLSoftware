package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.Area;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {

    // Consulta por nombre de área
    Area findByName(String name);

}

