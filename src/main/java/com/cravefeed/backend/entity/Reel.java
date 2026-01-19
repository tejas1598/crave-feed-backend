package com.cravefeed.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "reels")
public class Reel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String videoUrl; // URL to the video (AWS S3)

    private String description; // The caption (e.g., "Best burger in Pune!")

    private Integer likesCount = 0;

    // RELATIONSHIP: A Reel belongs to a Restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    // THE MAGIC LINK: This connects the Video to the Food
    @ManyToOne
    @JoinColumn(name = "menu_item_id", nullable = false)
    private MenuItem menuItem;
}