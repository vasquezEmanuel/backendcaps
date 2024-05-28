package com.example.backendcaps.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_suppier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    @Column(name = "name", nullable = false, unique = true)
    private String supplierName;

    @Column(name = "phone", nullable = false)
    private Integer supplierPhone;

    @Column(name = "address", nullable = false)
    private String supplierAddress;

    @ManyToMany
    @JoinTable(
            name = "tbl_supplierxcap",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "cap_id")
    )
    private List<Cap> caps;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(Integer supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public List<Cap> getCaps() {
        return caps;
    }

    public void setCaps(List<Cap> caps) {
        this.caps = caps;
    }
}

