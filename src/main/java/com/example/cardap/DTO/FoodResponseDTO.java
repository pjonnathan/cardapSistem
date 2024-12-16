package com.example.cardap.DTO;

import com.example.cardap.models.Food;
import org.jetbrains.annotations.NotNull;

public record FoodResponseDTO(Long id, String title, String image, Integer price){
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
