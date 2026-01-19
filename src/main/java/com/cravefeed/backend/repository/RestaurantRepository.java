package com.cravefeed.backend.repository;

import com.cravefeed.backend.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    // This gives us methods like .save(), .findById(), .findAll() for free!
}