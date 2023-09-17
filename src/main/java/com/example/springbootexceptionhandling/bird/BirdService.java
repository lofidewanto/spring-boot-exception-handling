package com.example.springbootexceptionhandling.bird;

import com.example.springbootexceptionhandling.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BirdService {

    @Autowired
    private BirdRepository birdRepository;

    public Bird getBirdNoException(Long birdId) {
        return birdRepository.findById(birdId).get();
    }

    public Bird getBird(Long birdId) {
        return birdRepository.findById(birdId).get();
    }

    public Bird createBird(Bird bird) {
        return birdRepository.save(bird);
    }

    public List<Bird> getBirdCollection(BirdCollection birdCollection) {
        List<Bird> birds = new ArrayList<>();

        for (Long birdId : birdCollection.getBirdsIds()) {
            Optional<Bird> bird = birdRepository.findById(birdId);
            if (bird.isEmpty()) {
                throw new EntityNotFoundException(Bird.class, "id", birdId.toString());
            }
            birds.add(bird.get());
        }
        return birds;
    }
}
