package com.dhm.initDb.repositories.user;


import com.dhm.initDb.repositories.user.entities.Token;
import com.dhm.initDb.repositories.user.entities.TokenType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends MongoRepository<Token, String> {

    Token findByToken(String token);

    Token findByUserId(String id);

    Token findByUserIdAndTokenType(String id, TokenType tokenType);

}
