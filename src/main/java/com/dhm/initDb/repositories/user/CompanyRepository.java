package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
	Company findByName(String name);

}
