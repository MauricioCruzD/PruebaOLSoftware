package com.test.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.test.OLSoftware.inventory.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
   // Consulta por nombre de usuario
    User findByUsername(String username);

    // Consulta por nombre y apellido
    List<User> findByFirstNameAndLastName(String firstName, String lastName);

    // Otra consulta personalizada utilizando @Query
    @Query("SELECT u FROM User u WHERE u.age > :age")
    List<User> findByAgeGreaterThan(@Param("age") int age);
}
