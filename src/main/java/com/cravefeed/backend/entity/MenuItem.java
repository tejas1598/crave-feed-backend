package com.cravefeed.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "menu_items")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // e.g., "Spicy Chicken Burger"

    private String description;

    @Column(nullable = false)
    private Double price; // e.g., 120.00

    private String imageUrl; // URL to the image (AWS S3)

    private String category; // 'MAIN', 'SIDE', 'DRINK' (Used for our AI Upselling)

    // RELATIONSHIP: Many items belong to One Restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
}