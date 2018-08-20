package com.historygo.controller;

import com.historygo.repository.UserRepository;
import com.historygo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name) {

		Users n = new Users();
		n.setName(name);

		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Users> getAllUsers() {

		return userRepository.findAll();
	}


	@GetMapping("/id/{id}")
	public Users getById(@PathVariable("id") int id){
		Users user = this.userRepository.findById(id);

		return user;
	}




	@GetMapping("/name/{name}")
	public Users getByName(@PathVariable("name") String name){
		Users user = this.userRepository.findByName(name);

		return user;

	}




}
