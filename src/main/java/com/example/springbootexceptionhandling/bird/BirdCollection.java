package com.example.springbootexceptionhandling.bird;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class BirdCollection {

    @NotNull
    @Size(min = 2)
    private List<Long> birdsIds;

    public List<Long> getBirdsIds() {
        return birdsIds;
    }

    public void setBirdsIds(List<Long> birds) {
        this.birdsIds = birds;
    }
}
