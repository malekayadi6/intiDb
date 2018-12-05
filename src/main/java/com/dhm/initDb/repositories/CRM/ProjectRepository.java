package com.dhm.initDb.repositories.CRM;

import com.dhm.initDb.repositories.CRM.entities.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the User entity.
 */
@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {

    Project findByProjectNameIgnoreCase(String projectName);
    List<Project> findByWebDevIdsContaining(String id);

}
