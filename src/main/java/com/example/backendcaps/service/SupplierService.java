package com.example.backendcaps.service;

import com.example.backendcaps.entity.Supplier;
import com.example.backendcaps.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers(){
        return supplierRepository.findAll();
    }

    public Optional<Supplier> getSupplier(Long supplierId){
        return supplierRepository.findById(supplierId);
    }

    public void saveOrUpdateSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    public void deleteSupplier(Long supplierId){
        supplierRepository.deleteById(supplierId);
    }
}

