package com.example.springbootexceptionhandling.bird;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static com.example.springbootexceptionhandling.bird.BirdObjectMother.createCanary;

@DataJpaTest
public class BirdRepositoryTest {

    @Autowired
    private BirdRepository birdRepository;

    @Test
    public void canSaveBird() {
        birdRepository.save(createCanary());
    }

}