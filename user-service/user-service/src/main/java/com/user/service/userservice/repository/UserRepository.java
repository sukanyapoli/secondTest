/**
 * 
 */
package com.user.service.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.service.userservice.entity.Users;

/**
 * @author mpoli
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByUserId(Long userId);

}
