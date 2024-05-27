package com.example.backendcaps.controller;

import com.example.backendcaps.entity.Invoice;
import com.example.backendcaps.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> getAllInvoice(){
        return invoiceService.getInvoices();
    }

    @GetMapping("/{invoiceId}")
    public Optional<Invoice> getInvoiceById(@PathVariable("invoiceId") Long invoiceId){
        return invoiceService.getInvoice(invoiceId);
    }

    @DeleteMapping("/{invoiceId}")
    public void deleteInvoice(@PathVariable("invoiceId") Long invoiceId){
        invoiceService.deleteInvoice(invoiceId);
    }

    @PostMapping
    public void saveUpdateInvoice(@RequestBody Invoice invoice){
        invoiceService.saveOrUpdateInvoice(invoice);
    }
}
