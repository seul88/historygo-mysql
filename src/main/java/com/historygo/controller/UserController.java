package com.historygo.controller;

import com.historygo.repository.UserRepository;
import com.historygo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam int points) {

		Users n = new Users();
		n.setName(name);
		n.setPoints(points);

		userRepository.save(n);
		return "Saved";
	}

	@PostMapping("/add")
	public void addUser(@RequestBody Users user){

		Users temp = new Users();
		temp.setPoints(0);
		temp.setName(user.getName());
		temp.setCountry(user.getCountry());
		temp.setEmail(user.getEmail());


		this.userRepository.save(temp);

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

	@GetMapping("/points/{points}")
	public List<Users> getByPoints(@PathVariable("points") int points){

		List<Users> users = this.userRepository.findByPointsGreaterThanEqual(points);

		return users;
	}


	@GetMapping("/country/{country}")
	public List<Users> listByCountry(@PathVariable("country") String country){

		List<Users> users = this.userRepository.findByCountry(country);

		return users;

	}


	@GetMapping("/email/{email}")
	public List<Users> findyByEmail(@PathVariable("email") String email){

		List<Users> user = this.userRepository.findByEmail(email);

		return user;

	}


	@PutMapping("/name/{name}")
	public void setUserName(@PathVariable("name") String name, @RequestBody String nick){
		Users user = this.userRepository.findByName(name);
		user.setName(nick);
		this.userRepository.save(user);
	}

	@PutMapping("/id/{id}")
	public void setUserNameById(@PathVariable("id") int id, @RequestBody String name){
		Users user = this.userRepository.findById(id);
		user.setName(name);
		this.userRepository.save(user);
	}



}
