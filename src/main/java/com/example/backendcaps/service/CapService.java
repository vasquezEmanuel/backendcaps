package com.example.backendcaps.service;

import com.example.backendcaps.entity.Cap;
import com.example.backendcaps.repository.CapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapService {

    @Autowired
    CapRepository capRepository;

    public List<Cap> getCaps(){
        return capRepository.findAll();
    }

    public Optional<Cap> getCap(Long capId){
        return capRepository.findById(capId);
    }

    public void saveOrUpdateCap(Cap cap){
        capRepository.save(cap);
    }

    public void deleteCap(Long capId){
        capRepository.deleteById(capId);
    }

}
