package com.dhm.initDb.repositories.user.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
public class Token {

    @Id
    private String id;
    private String token;
    private TokenType tokenType;
    private Instant expirationDate;
    @DBRef
    private User user;

    public Token() {
    }

    public Token(String token, TokenType tokenType, Instant expirationDate, User user) {
        this.token = token;
        this.tokenType = tokenType;
        this.expirationDate = expirationDate;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id='" + id + '\'' +
                ", token='" + token + '\'' +
                ", tokenType=" + tokenType +
                ", expirationDate=" + expirationDate +
                ", user=" + user +
                '}';
    }
}
