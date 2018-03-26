package com.app.ecommerce.repository;

import com.app.ecommerce.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Praful Jha on 24/03/2018
 */

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

    Role findRoleById(long id);
}
