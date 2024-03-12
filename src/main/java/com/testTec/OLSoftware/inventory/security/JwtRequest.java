package com.testTec.OLSoftware.inventory.security;

/**
 *
 * @author macru
 */
import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;

}