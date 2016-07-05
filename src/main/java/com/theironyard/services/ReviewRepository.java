package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jonathandavidblack on 6/30/16.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    public Iterable<Review> findByLecturer(Lecturer lecturer);

}
