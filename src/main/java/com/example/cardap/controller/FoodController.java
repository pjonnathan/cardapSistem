package com.example.cardap.controller;

import com.example.cardap.DTO.FoodRequestDTO;
import com.example.cardap.DTO.FoodResponseDTO;
import com.example.cardap.models.Food;
import com.example.cardap.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getName(){
        List<FoodResponseDTO> findList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return findList;
    }
}
