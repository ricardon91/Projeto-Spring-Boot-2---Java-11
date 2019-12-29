package com.ricardon.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardon.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
