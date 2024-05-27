package com.example.backendcaps.service;

import com.example.backendcaps.entity.Invoice;
import com.example.backendcaps.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoices(){
        return invoiceRepository.findAll();
    }

    public Optional<Invoice> getInvoice(Long invoiceId){
        return invoiceRepository.findById(invoiceId);
    }

    public void saveOrUpdateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Long invoiceId){
        invoiceRepository.deleteById(invoiceId);
    }
}
