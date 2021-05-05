package com.user.userbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.userbackend.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{



}
