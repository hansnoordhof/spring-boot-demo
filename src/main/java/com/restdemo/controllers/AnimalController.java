package com.restdemo.controllers;

import com.restdemo.model.Animal;
import com.restdemo.model.Bird;
import com.restdemo.model.Fish;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hans on 06-12-15.
 */
@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @RequestMapping(method = RequestMethod.GET)
    public Animal getAllAnimals() {
        return null;
    }

    @RequestMapping("/bird")
    public Bird getBird() {
        Bird bird = new Bird();
        bird.setName("Spreeuw");
        bird.setAge(1);
        bird.setHeight(23);
        return bird;
    }

    @RequestMapping(value = "/fish/{name}")
    public Fish getFish(@PathVariable("name") String name) {
        Fish fish = new Fish();
        fish.setName(name);
        fish.setAge(1);
        fish.setHeight(23);
        return fish;
    }

}
