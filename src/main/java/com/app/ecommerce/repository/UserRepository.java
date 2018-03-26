package com.app.ecommerce.repository;

import com.app.ecommerce.domain.Role;
import com.app.ecommerce.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * created by Praful Jha on 24/03/2018
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findUserById(long id);

    User findUserByEmail(String email);
}
