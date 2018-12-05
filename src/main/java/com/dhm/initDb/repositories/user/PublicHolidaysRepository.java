package com.dhm.initDb.repositories.user;


import com.dhm.initDb.repositories.user.entities.PublicHolidays;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublicHolidaysRepository extends MongoRepository<PublicHolidays, String> {

}
