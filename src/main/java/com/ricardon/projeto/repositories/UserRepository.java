package com.ricardon.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardon.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
