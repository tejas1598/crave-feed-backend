package com.cravefeed.backend.repository;

import com.cravefeed.backend.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    // Custom Logic: "Find all food items for a specific Restaurant"
    // Spring Boot automatically understands this name and writes the SQL!
    List<MenuItem> findByRestaurantId(Long restaurantId);
}