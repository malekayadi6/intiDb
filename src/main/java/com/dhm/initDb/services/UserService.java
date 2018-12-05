package com.dhm.initDb.services;

import com.dhm.initDb.dto.UserDTO;
import com.dhm.initDb.repositories.user.entities.User;

public interface UserService {
    User createUser(UserDTO userDTO);

}
