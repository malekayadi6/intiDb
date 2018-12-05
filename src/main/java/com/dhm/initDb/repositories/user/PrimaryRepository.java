package com.dhm.initDb.repositories.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryRepository extends MongoRepository<PrimaryModel , String> {
}
