package com.testTec.OLSoftware.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication()

public class InventoryApplication {

	public static void main(String[] args) { 
            
                System.setProperty("server.servlet.context-path", "/api/inventario");
                SpringApplication.run(InventoryApplication.class, args);
	}

}
