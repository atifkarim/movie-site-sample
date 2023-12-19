package com.example.moviesitesample.movie;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    
    // Fetch movie by imdbId
    Optional<Movie> findMovieByImdbId(String imdbId);
}