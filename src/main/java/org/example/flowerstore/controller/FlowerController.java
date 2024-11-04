package org.example.flowerstore.controller;

import org.example.flowerstore.model.Flower;
import org.example.flowerstore.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping
    public Flower addFlower(@RequestBody Flower flower) {
        return flowerService.addFlower(flower);
    }
}