/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
 
    Role findByName(String name);
     
}