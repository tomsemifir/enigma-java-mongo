package fr.semifir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.semifir.models.User;
import fr.semifir.repositories.UserRepository;

@Service
public class UserService {
	
	// Injection du repository
	@Autowired
	private UserRepository repository;
	
	// Méthode permettant de récupérer tous les utilisateurs
	public List<User> getAll() {
		return this.repository.findAll();
	}
	
	public Optional<User> getById(String id) {
		return this.repository.findById(id);
	}
	
	// Méthode permettant d'insérer un utilisateur "user"
	public void create(User user) {
		this.repository.save(user);
	}
	
	public void delete(User user) {
		this.repository.delete(user);
	}
}
