package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PermissionRepository extends MongoRepository<Permission, String> {

	Permission findByName(String name);
}
