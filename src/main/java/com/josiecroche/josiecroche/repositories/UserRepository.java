package com.josiecroche.josiecroche.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josiecroche.josiecroche.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
