package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Address;
import com.example.demo.beans.User;
import com.example.demo.phonedirectory.service.SearchService;


@RestController
@RequestMapping(value = "/phonedirectory/search")
public class SearchController {
	
	@Autowired
	private SearchService searchSearch;

	@GetMapping(path = "/users", consumes = "application/json", produces = "application/json")
	public List<User> searchUsers(@RequestBody User user) {
		Address address = new Address("#3278/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user1 = new User("Chhotelal", "Prasad", "Gupta", address, "9891074820");
		List<User> userList = new ArrayList<>();

		userList.add(user1);

		return searchSearch.searchName(user);

	}
	
	@GetMapping(value = "/user",  produces = "application/json")
	public List<User> searchUser(@RequestParam(value="name", required=true)  String name) {
		Address address = new Address("#3278/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user1 = new User("Chhotelal", "Prasad", "Gupta", address, "9891074820");
		List<User> userList = new ArrayList<>();

		userList.add(user1);
		User user = new User();
		user.setFirstName(name);
		user.setMiddleName(name);
		user.setLastName(name);
		return searchSearch.searchName(user);

	}


}
