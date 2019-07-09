package com.leaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaf.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
