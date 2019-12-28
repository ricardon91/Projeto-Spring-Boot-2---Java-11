package com.ricardon.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardon.projeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){		
		User u = new User(1L, "Ricardo", "ricardo@gmail.com", "975487708", "141626");
		return ResponseEntity.ok().body(u);
	}

}
