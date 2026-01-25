package com.cravefeed.backend.service;

import com.cravefeed.backend.entity.Reel;
import com.cravefeed.backend.entity.Restaurant;
import com.cravefeed.backend.repository.ReelRepository;
import com.cravefeed.backend.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReelService {

    private final ReelRepository reelRepository;
    private final RestaurantRepository restaurantRepository;

    public ReelService(ReelRepository reelRepository, RestaurantRepository restaurantRepository) {
        this.reelRepository = reelRepository;
        this.restaurantRepository = restaurantRepository;
    }

    public Reel addReel(Long restaurantId, Reel reel) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        reel.setRestaurant(restaurant);
        return reelRepository.save(reel);
    }

    public List<Reel> getAllReels() {
        return reelRepository.findAll();
    }
}