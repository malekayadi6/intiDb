package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Holiday;
import com.dhm.initDb.repositories.user.entities.HolidayStatus;
import com.dhm.initDb.repositories.user.entities.HolidayType;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface HolidayRepository extends MongoRepository<Holiday, String> {

  List<Holiday> findByStartDateAndEndDateIsBetween(String startDate, String endDate);
  List<Holiday> findByStatus(HolidayStatus holidayStatus);
  List<Holiday> findByType(HolidayType holidayType);
}
