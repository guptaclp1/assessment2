package com.example.demo.phonedirectory.dao;

import java.util.List;

import com.example.demo.beans.User;

public interface PhoneDirectorySearch {
	
	public List<User> searchName(User user);
	
	public List<User> searchUser(User user);

}
