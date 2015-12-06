package com.restdemo.model;

import com.restdemo.model.interfaces.Flyable;
import com.restdemo.model.interfaces.Walkable;

/**
 * Created by hans on 06-12-15.
 */
public class Bird extends Animal implements Flyable, Walkable{

    @Override
    public void canFly() {
        System.out.println("This bird can fly");
    }

    @Override
    public void canWalk() {
        System.out.println("This bird can walk");
    }
}
