package com.dhm.initDb.repositories.CRM;

import com.dhm.initDb.repositories.CRM.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data MongoDB repository for the Customer entity.
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findByCompanyNameLike(String companyName);
    Optional<Customer> findByCompanyName(String name);
    // TODO
   // List<Customer> findByBizDevsIdsContains(String bizDevsId);
    @Query("{ $or:[ {'createdBy' : ?0} ,{'bizDevsIds' : ?1} ]}")
    List<Customer> findByCreatedByOrBizDevsIdsContaining(String createdBy, String Id);
}
