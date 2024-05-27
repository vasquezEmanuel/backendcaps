package com.example.backendcaps.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "phone")
    private Integer userPhone;

    @Column(name = "name", nullable = false)
    private String userName;

    @Column(name = "email", unique = true)
    private String userEmail;

    @Column(name = "address", nullable = false)
    private String userAddress;

    @OneToMany(mappedBy = "user")
    private List<Invoice> userInvoices;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public List<Invoice> getUserInvoices() {
        return userInvoices;
    }

    public void setUserInvoices(List<Invoice> userInvoices) {
        this.userInvoices = userInvoices;
    }
}
