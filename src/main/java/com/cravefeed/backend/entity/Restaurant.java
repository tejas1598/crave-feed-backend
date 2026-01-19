package com.cravefeed.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Lombok generates Getters/Setters automatically
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(name = "owner_id")
    private Long ownerId; // The ID of the User who owns this stall

    // The Business Logic: We take 20% to subsidize delivery
    private Double commissionRate = 0.20;

    // The Dashboard Logic: Is the stall currently taking orders?
    private boolean isOpen = false;

    // Coordinates for our "Simulated Delivery" service
    private Double latitude;
    private Double longitude;
}