package com.cravefeed.backend.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String videoUrl; // URL to the video file
    private String description; // e.g., "Check out our cheesy pizza!"
    private int likes = 0; // Start with 0 likes

    // RELATIONSHIP: Many Reels belong to One Restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    @JsonIgnore // Prevents infinite loops when converting to JSON
    private Restaurant restaurant;

    // Constructors
    public Reel() {}

    public Reel(String videoUrl, String description, Restaurant restaurant) {
        this.videoUrl = videoUrl;
        this.description = description;
        this.restaurant = restaurant;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }

    public Restaurant getRestaurant() { return restaurant; }
    public void setRestaurant(Restaurant restaurant) { this.restaurant = restaurant; }
}