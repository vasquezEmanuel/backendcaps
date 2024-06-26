package com.example.backendcaps.controller;

import com.example.backendcaps.entity.Cap;
import com.example.backendcaps.service.CapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/cap")
public class CapController {

    @Autowired
    private CapService capService;

    @GetMapping
    public List<Cap> getAllCap(){
        return capService.getCaps();
    }

    @GetMapping("/{capId}")
    public Optional<Cap> getCapById(@PathVariable("capId") Long capId){
        return capService.getCap(capId);
    }


    @DeleteMapping("/{capId}")
    public void deleteCap(@PathVariable("capId") Long capId){
        capService.deleteCap(capId);
    }

    @PostMapping
    public void saveUpdateCap(@RequestBody Cap cap){
        capService.saveOrUpdateCap(cap);
    }
}
