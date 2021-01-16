package com.example.demo.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.User;
import com.example.demo.phonedirectory.service.SearchService;


@RestController
@RequestMapping(value = "/phonedirectory/search")
public class SearchController {
	
	@Autowired
	private SearchService searchSearch;
	
	private final String  REGULAR_ExPRESSION ="[a-zA-Z0-9]+";

	@GetMapping(path = "/users", consumes = "application/json", produces = "application/json")
	public List<User> searchUsers(@RequestBody User user) {
		return searchSearch.searchName(user);

	}
	
	@GetMapping(value = "/user",  produces = "application/json")
	public List<User> searchUser(@RequestParam(value="name", required=true)  String name) {
		
		boolean match =Pattern.matches(REGULAR_ExPRESSION,name);
		
		if(match) {
			
		User user = new User();
		user.setFirstName(name);
		user.setMiddleName(name);
		user.setLastName(name);
		return searchSearch.searchName(user);
		
		}else {
			return null;
		}

	}


}
