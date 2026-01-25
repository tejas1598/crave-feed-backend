package com.cravefeed.backend.service;

import com.cravefeed.backend.entity.MenuItem;
import com.cravefeed.backend.entity.Restaurant;
import com.cravefeed.backend.repository.MenuItemRepository;
import com.cravefeed.backend.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final RestaurantRepository restaurantRepository;

    public MenuItemService(MenuItemRepository menuItemRepository, RestaurantRepository restaurantRepository) {
        this.menuItemRepository = menuItemRepository;
        this.restaurantRepository = restaurantRepository;
    }

    // Feature 1: Add food to a specific Restaurant
    public MenuItem addMenuItem(Long restaurantId, MenuItem item) {
        // 1. Find the restaurant first
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found!"));

        // 2. Link the food to the restaurant
        item.setRestaurant(restaurant);

        // 3. Save to database
        return menuItemRepository.save(item);
    }

    // Feature 2: Get the menu for a specific Restaurant
    public List<MenuItem> getMenuByRestaurant(Long restaurantId) {
        return menuItemRepository.findByRestaurantId(restaurantId);
    }
}