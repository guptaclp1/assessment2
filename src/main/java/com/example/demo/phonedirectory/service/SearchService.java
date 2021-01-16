package com.example.demo.phonedirectory.service;

import java.util.List;

import com.example.demo.beans.User;

public interface SearchService {
	
	public List<User> searchName(User user);
	
	public List<User> searchUser(User user);

}
