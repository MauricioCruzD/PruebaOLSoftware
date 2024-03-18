package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.TypesId;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TypeIdRepository extends JpaRepository<TypesId, Integer>{
    
    TypesId findByName(String name);

}
