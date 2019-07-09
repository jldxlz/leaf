package com.leaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaf.entity.User;

/**
 * 
 * @author liu zh
 *
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
