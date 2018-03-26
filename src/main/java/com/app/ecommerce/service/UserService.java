package com.app.ecommerce.service;

import com.app.ecommerce.domain.User;
import org.springframework.stereotype.Service;

/**
 * created by Praful Jha on 25/03/2018
 */

@Service
public interface UserService {

     User createUser(User user);
     User deleteUserById(long id);
     User updateUser(long id, User user);
     User findUserById(long id);

}
