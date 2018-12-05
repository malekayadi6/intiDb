package com.dhm.initDb.services.Imp;

import com.dhm.initDb.dto.UserDTO;
import com.dhm.initDb.repositories.user.AuthorityRepository;
import com.dhm.initDb.repositories.user.UserRepository;
import com.dhm.initDb.repositories.user.entities.Authority;
import com.dhm.initDb.repositories.user.entities.User;
import com.dhm.initDb.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserServiceImp implements UserService {

    @Autowired
    public AuthorityRepository authorityRepository;


    @Autowired
    private UserRepository userRepository ;


    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setFirstName(userDTO.getFirstName());
        user.setSecondName(userDTO.getSecondName());
        user.setMail(userDTO.getMail());
        user.setType(userDTO.getType());
        user.setPassword("password123456");
        if (userDTO.getAuthority() != null) {
            Authority authority = authorityRepository.findByName(userDTO.getAuthority());
            user.setAuthority(authority);
        }
        user.setActivated(false);
        User newUser = userRepository.save(user);

        log.info("Created Information for User: {}", newUser.getId());
        return newUser;
    }

}
