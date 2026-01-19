package com.cravefeed.backend.repository;

import com.cravefeed.backend.entity.Reel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReelRepository extends JpaRepository<Reel, Long> {

    // Logic: "Get me all videos for this specific restaurant"
    List<Reel> findByRestaurantId(Long restaurantId);
}