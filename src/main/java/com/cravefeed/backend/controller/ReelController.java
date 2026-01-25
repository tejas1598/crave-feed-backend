package com.cravefeed.backend.controller;

import com.cravefeed.backend.entity.Reel;
import com.cravefeed.backend.service.ReelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reels")
public class ReelController {

    private final ReelService reelService;

    public ReelController(ReelService reelService) {
        this.reelService = reelService;
    }

    // POST http://localhost:8080/api/reels/{restaurantId}
    // Example: Add a video reel to Burger King (ID: 1)
    @PostMapping("/{restaurantId}")
    public Reel addReel(@PathVariable Long restaurantId, @RequestBody Reel reel) {
        return reelService.addReel(restaurantId, reel);
    }

    // GET http://localhost:8080/api/reels
    // Example: Show me all video reels (The "TikTok" feed)
    @GetMapping
    public List<Reel> getAllReels() {
        return reelService.getAllReels();
    }
}