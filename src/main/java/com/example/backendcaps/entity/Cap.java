package com.example.backendcaps.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tlb_cap")
public class Cap {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long capId;

    @Column(name = "color", nullable = false)
    private String capColor;

    @Column(name = "size", nullable = false)
    private String capSize;

    @Column(name = "description",nullable = false)
    private String capDescription;

    @Column(name = "price",nullable = false)
    private Double capPrice;

    @ManyToMany(mappedBy = "caps")
    private List<Invoice> invoices;

    @ManyToMany
    @JoinTable(
            name = "tbl_suppierxcap",
            joinColumns = @JoinColumn(name = "cap_id"),
            inverseJoinColumns = @JoinColumn(name = "suppier_id")
    )
    private List<Supplier> suppliers;

    public Long getCapId() {
        return capId;
    }

    public void setCapId(Long capId) {
        this.capId = capId;
    }

    public String getCapColor() {
        return capColor;
    }

    public void setCapColor(String capColor) {
        this.capColor = capColor;
    }

    public String getCapSize() {
        return capSize;
    }

    public void setCapSize(String capSize) {
        this.capSize = capSize;
    }

    public String getCapDescription() {
        return capDescription;
    }

    public void setCapDescription(String capDescription) {
        this.capDescription = capDescription;
    }

    public Double getPrice() {
        return capPrice;
    }

    public void setPrice(Double price) {
        this.capPrice = price;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
