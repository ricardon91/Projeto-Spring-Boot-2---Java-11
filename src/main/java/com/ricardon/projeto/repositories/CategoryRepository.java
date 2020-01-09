package com.ricardon.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardon.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
