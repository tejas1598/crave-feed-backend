package com.cravefeed.backend.service;

import com.cravefeed.backend.entity.Restaurant;
import com.cravefeed.backend.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {

    // Dependency Injection: We ask Spring to give us the Repository
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    // Feature 1: Get all restaurants for the Feed
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    // Feature 2: Onboard a new Restaurant
    public Restaurant createRestaurant(Restaurant restaurant) {
        // Business Logic: Automatically set the commission rate
        restaurant.setCommissionRate(0.20);
        restaurant.setOpen(true); // Default to open

        return restaurantRepository.save(restaurant);
    }
}