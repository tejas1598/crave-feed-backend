package com.cravefeed.backend.controller;

import com.cravefeed.backend.entity.MenuItem;
import com.cravefeed.backend.service.MenuItemService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuItemController {

    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    // POST http://localhost:8080/api/menu/{restaurantId}
    // Example: Add a burger to Restaurant #1
    @PostMapping("/{restaurantId}")
    public MenuItem addMenuItem(@PathVariable Long restaurantId, @RequestBody MenuItem item) {
        return menuItemService.addMenuItem(restaurantId, item);
    }

    // GET http://localhost:8080/api/menu/{restaurantId}
    // Example: Show me the menu for Restaurant #1
    @GetMapping("/{restaurantId}")
    public List<MenuItem> getMenu(@PathVariable Long restaurantId) {
        return menuItemService.getMenuByRestaurant(restaurantId);
    }
}