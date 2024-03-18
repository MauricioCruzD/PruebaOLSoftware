package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.TypeIdService;
import com.testTec.OLSoftware.inventory.model.TypesId;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/typesId")

public class TypeIdController {
    
    @Autowired
    private TypeIdService typeIdService;
   
    @GetMapping("/getTypesId")
    public List<TypesId> getAllTypesId() {
        return typeIdService.getAllTypesId();
    }

    @GetMapping("/getTypeId/{id}")
    public TypesId getStateById(@PathVariable Integer id) {
        return typeIdService.getTypeIdById(id);
    }

    @PostMapping("/createTypeId")
    public TypesId createTypeId(@Valid @RequestBody TypesId typeId) {
        return typeIdService.createTypeId(typeId);
    }

    @PutMapping("/updateTypeId/{id}")
    public TypesId updateTypeId(@PathVariable Integer id, @RequestBody TypesId typeId) {
        return typeIdService.updateTypeId(id, typeId);
    }

    @DeleteMapping("/deleteTypeId/{id}")
    public void deleteTypeId(@PathVariable Integer id) {
        typeIdService.deleteTypeId(id);
    }
}
