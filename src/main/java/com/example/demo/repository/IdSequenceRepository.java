package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.model.IdSequence;

public interface IdSequenceRepository extends MongoRepository<IdSequence, String> {
}
