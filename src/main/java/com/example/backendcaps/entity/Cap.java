package com.example.backendcaps.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_cap")
public class Cap {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long capId;

    @Column(name = "size_id", nullable = false)
    private Integer sizeId;

    @Column(name = "color_id", nullable = false)
    private Integer colorId;

    @Column(name = "description",nullable = false)
    private String capDescription;

    @Column(name = "price", nullable = false)
    private Double capPrice;

    @Column(name = "image")
    private String imageUrl;

    @Column(name = "warranty_id")
    private Integer warrantyId;

    @ManyToMany(mappedBy = "caps")
    private List<Invoice> invoices;

    @ManyToMany(mappedBy = "caps")
    private List<Supplier> suppliers;


    public Long getCapId() {
        return capId;
    }

    public void setCapId(Long capId) {
        this.capId = capId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getCapDescription() {
        return capDescription;
    }

    public void setCapDescription(String capDescription) {
        this.capDescription = capDescription;
    }

    public Double getCapPrice() {
        return capPrice;
    }

    public void setCapPrice(Double capPrice) {
        this.capPrice = capPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getWarrantyId() {
        return warrantyId;
    }

    public void setWarrantyId(Integer warrantyId) {
        this.warrantyId = warrantyId;
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
