package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityRepository extends MongoRepository<Authority, String> {

    List<Authority> findByNameLike(String name);
    Authority findByName(String name);
    List<Authority> findByNameIn(List<String> listName);


}
