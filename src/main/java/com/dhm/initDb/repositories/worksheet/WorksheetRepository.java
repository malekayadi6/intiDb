package com.dhm.initDb.repositories.worksheet;

import com.dhm.initDb.repositories.worksheet.entities.Worksheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Worksheet entity.
 */
@Repository
public interface WorksheetRepository extends MongoRepository<Worksheet, String> {

    List<Worksheet> findByWebDevId(String webDevId);

    List<Worksheet> findByProjectId(String projectId);

    Worksheet findByWebDevIdAndProjectIdAndMonthAndYear(String webDevId, String projectId, int month, int year);

}