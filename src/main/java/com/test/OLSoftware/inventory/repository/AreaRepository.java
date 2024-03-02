package com.test.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.OLSoftware.inventory.model.Area;
import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Long> {

    // Consulta por nombre de área
    Area findByName(String name);

    // Consulta por estado
    List<Area> findByState(String state);
}

