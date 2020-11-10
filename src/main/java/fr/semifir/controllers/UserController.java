package fr.semifir.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.User;
import fr.semifir.services.UserService;

@RestController
@RequestMapping("blablabla")
public class UserController {

	@Autowired
	public UserService service;
	
	@GetMapping()
	public List<User> getAll() {
		return this.service.getAll();
	}
	
	//localhost:8080/blablabla/{id}
	@GetMapping("/{id}")
	public Optional<User> getById(@PathVariable String id) {
		return this.service.getById(id);
	}
	
	@PostMapping()
	public void create(@RequestBody User user) {
		this.service.create(user);
	}
	
	@DeleteMapping()
	public void delete(@RequestBody User user) {
		this.service.delete(user);
	}
}
