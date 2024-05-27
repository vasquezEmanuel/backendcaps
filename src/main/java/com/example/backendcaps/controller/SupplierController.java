package com.example.backendcaps.controller;

import com.example.backendcaps.entity.Supplier;
import com.example.backendcaps.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public List<Supplier> getAllSupplier(){
        return supplierService.getSuppliers();
    }

    @GetMapping("/{supplierId}")
    public Optional<Supplier> getSupplierById(@PathVariable("supplierId") Long supplierId){
        return supplierService.getSupplier(supplierId);
    }

    @DeleteMapping("/{supplierId}")
    public void deleteSupplier(@PathVariable("supplierId") Long supplierId){
        supplierService.deleteSupplier(supplierId);
    }

    @PostMapping
    public void saveUpdateSupplier(@RequestBody Supplier supplier){
        supplierService.saveOrUpdateSupplier(supplier);
    }
}
