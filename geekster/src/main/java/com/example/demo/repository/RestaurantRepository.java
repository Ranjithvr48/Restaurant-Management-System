package com.example.demo.repository;

import com.example.demo.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RestaurantRepository {
    private final Map<Long, Restaurant> restaurantMap;
    private long idCounter;

    public RestaurantRepository() {
        this.restaurantMap = new HashMap<>();
        this.idCounter = 1L;
    }

    public Restaurant findById(Long id) {
        return restaurantMap.get(id);
    }

    public List<Restaurant> findAll() {
        return new ArrayList<>(restaurantMap.values());
    }

    public Restaurant save(Restaurant restaurant) {
        if (restaurant.getId() == null) {
            restaurant.setId(idCounter++);
        }
        restaurantMap.put(restaurant.getId(), restaurant);
        return restaurant;
    }

    public void deleteById(Long id) {
        restaurantMap.remove(id);
    }
}
