package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Skills;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillsRepository  extends MongoRepository<Skills, String> {
    Skills findByName(String name);
}
