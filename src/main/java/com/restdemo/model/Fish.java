package com.restdemo.model;

import com.restdemo.model.interfaces.Swimable;

/**
 * Created by hans on 06-12-15.
 */
public class Fish extends Animal implements Swimable {
    @Override
    public void canSwim() {
        System.out.println("this fish can swim");
    }
}
