package com.example.demo.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Response;
import com.example.demo.beans.User;
import com.example.demo.constants.Constant;
import com.example.demo.phonedirectory.service.SearchService;
import com.example.demo.validation.Requestvalidation;


@RestController
@RequestMapping(value = "/phonedirectory/search")
public class SearchController {
	
	@Autowired
	private SearchService searchSearch;
	
	

	@GetMapping(path = "/users", consumes = "application/json", produces = "application/json")
	public Response searchUsers(@RequestBody User user) {
		if(Requestvalidation.validateUser(user)) {
			
			return new Response(searchSearch.searchName(user),Constant.SUCCSS_RESPONSE_CODE,Constant.SUCCESS_MESSAGE);
			
		}else {
			return new Response("",Constant.ERROR_RESPONSE_CODE,Constant.INVALID_INPUT_MESSAGE);
		}

	}
	
	@GetMapping(value = "/user",  produces = "application/json")
	public Response searchUser(@RequestParam(value="name", required=true)  String name) {
		
		boolean match =Pattern.matches(Constant.REGULAR_ExPRESSION,name);
		
		if(match && name != null) {
			
		User user = new User();
		user.setFirstName(name);
		user.setMiddleName(name);
		user.setLastName(name);
				
		return new Response(searchSearch.searchName(user),Constant.SUCCSS_RESPONSE_CODE,Constant.SUCCESS_MESSAGE);
		
		}else {
			return new Response("",Constant.ERROR_RESPONSE_CODE,Constant.INVALID_INPUT_MESSAGE);
		}

	}


}
