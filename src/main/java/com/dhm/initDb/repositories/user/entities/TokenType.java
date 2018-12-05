package com.dhm.initDb.repositories.user.entities;

public enum TokenType {
    RECOVERTOKEN, ACTIVATIONACCOUNTTOKEN;

    public int numberOfValidationDays() {
        switch (this) {
            case RECOVERTOKEN:
                return 24;
            case ACTIVATIONACCOUNTTOKEN:
                return 72;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}
