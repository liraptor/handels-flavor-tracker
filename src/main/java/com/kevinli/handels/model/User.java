package com.kevinli.handels.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "handels_users")
public class User {

    @Id
    @Column(name = "user_id", length = 20)
    private String userId;

    @Column(length = 10, nullable = false)
    private String pin;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "ip_address", length = 45)
    private String ipAddress;

    // Getters and Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
