package com.dhm.initDb.repositories.user;

import com.dhm.initDb.repositories.user.entities.Authority;
import com.dhm.initDb.repositories.user.entities.Skills;
import com.dhm.initDb.repositories.user.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data MongoDB repository for the User entity.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

	Optional<User> findByUserName(String userName);

	User findByFirstNameAndSecondName(String firstName, String secondName);

	User findByMail(String mail);

	Optional<User> findOneByMailIgnoreCase(String mail);

	Optional<User> findOneByUserName(String username);

	Optional<User> findOneWithAuthoritiesByUserName(String userName);

	Optional<User> findOneById(String id);

	Optional<List<User>> findByAuthorityIn(List<Authority> listAuthorityName);

	Long countBySkillsContaining(Skills skills);
	
	Long countByAuthorityContaining(Authority authority);

	List<User> findByAuthority(Authority authority);

}
