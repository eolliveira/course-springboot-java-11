package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findall(){
		User user = new User(1L, "Erick", "erick@gmail.com", "5486184", "181854");
		return ResponseEntity.ok().body(user);
	}
}
