package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.testTec.OLSoftware.inventory.model.Users;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
   // Consulta por nombre de usuario
    Users findByUsername(String username);

    // Consulta por nombre y apellido
    List<Users> findByFirstNameAndLastName(String firstName, String lastName);

    // Otra consulta personalizada utilizando @Query
    // @Query("SELECT u FROM Users u WHERE u.age > :age")
    // List<User> findByAgeGreaterThan(@Param("age") int age);
}
