package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.testTec.OLSoftware.inventory.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   // Consulta por nombre de usuario
    User findByUsername(String username);

    // Consulta por nombre y apellido
    List<User> findByFirstNameAndLastName(String firstName, String lastName);

    // Otra consulta personalizada utilizando @Query
    // @Query("SELECT u FROM User u WHERE u.age > :age")
    // List<User> findByAgeGreaterThan(@Param("age") int age);
}
