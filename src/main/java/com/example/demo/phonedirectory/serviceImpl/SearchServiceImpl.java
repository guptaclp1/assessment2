package com.example.demo.phonedirectory.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.User;
import com.example.demo.phonedirectory.dao.PhoneDirectorySearch;
import com.example.demo.phonedirectory.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private PhoneDirectorySearch searchDao;

	@Override
	public List<User> searchName(User user) {
		
		return searchDao.searchName(user);
	}

	@Override
	public List<User> searchUser(User user) {
		return searchDao.searchUser(user);
	}
	
	

	

}
