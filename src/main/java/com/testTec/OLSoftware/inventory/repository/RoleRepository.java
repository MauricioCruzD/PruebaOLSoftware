/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {
 
    Roles findByName(String name);
     
}