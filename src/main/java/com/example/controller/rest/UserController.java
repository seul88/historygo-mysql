package com.example.controller.rest;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/users")
public class UserController {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	/*
	@GetMapping(path="/add")
	public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam int points) {

		User n = new User();
		n.setName(name);
		n.setPoints(points);

		userRepository.save(n);
		return "Saved";
	}
*/

	@PostMapping("/add")
	public void addUser(@RequestBody User user){

		User temp = new User();
	//	temp.setPoints(0);
		temp.setName(user.getName());
	//	temp.setCountry(user.getCountry());
		temp.setEmail(user.getEmail());


		this.userRepository.save(temp);

	}

	
	@GetMapping(path="/all")
	public @ResponseBody
    Iterable<User> getAllUsers() {

		return userRepository.findAll();
	}


	@GetMapping("/id/{id}")
	public User getById(@PathVariable("id") int id){
		User user = this.userRepository.findById(id);

		return user;
	}




	@GetMapping("/name/{name}")
	public User getByName(@PathVariable("name") String name){
		User user = this.userRepository.findByName(name);

		return user;

	}


	@GetMapping("/points/{points}")
	public List<User> getByPoints(@PathVariable("points") int points){

		List<User> users = this.userRepository.findByPointsGreaterThanEqual(points);

		return users;
	}


	@GetMapping("/country/{country}")
	public List<User> listByCountry(@PathVariable("country") String country){

		List<User> users = this.userRepository.findByCountry(country);

		return users;

	}


	@GetMapping("/email/{email}")
	public User findyByEmail(@PathVariable("email") String email){

		User user = this.userRepository.findByEmail(email);

		return user;

	}


	@PutMapping("/name/{name}")
	public void setUserName(@PathVariable("name") String name, @RequestBody String nick){
		User user = this.userRepository.findByName(name);
		user.setName(nick);
		this.userRepository.save(user);
	}

	@PutMapping("/id/{id}")
	public void setUserNameById(@PathVariable("id") int id, @RequestBody String name){
		User user = this.userRepository.findById(id);
		user.setName(name);
		this.userRepository.save(user);
	}



}
