package com.example.backendcaps.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_suppier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long suppierId;

    @Column(name = "name", nullable = false, unique = true)
    private String suppierName;

    @Column(name = "phone", nullable = false)
    private Integer suppierPhone;

    @Column(name = "address", nullable = false)
    private String suppierAddress;

    @ManyToMany(mappedBy = "suppliers")
    private List<Cap> caps;

    public Long getSuppierId() {
        return suppierId;
    }

    public void setSuppierId(Long suppierId) {
        this.suppierId = suppierId;
    }

    public String getSuppierName() {
        return suppierName;
    }

    public void setSuppierName(String suppierName) {
        this.suppierName = suppierName;
    }

    public Integer getSuppierPhone() {
        return suppierPhone;
    }

    public void setSuppierPhone(Integer suppierPhone) {
        this.suppierPhone = suppierPhone;
    }

    public String getSuppierAddress() {
        return suppierAddress;
    }

    public void setSuppierAddress(String suppierAddress) {
        this.suppierAddress = suppierAddress;
    }

    public List<Cap> getCaps() {
        return caps;
    }

    public void setCaps(List<Cap> caps) {
        this.caps = caps;
    }
}
