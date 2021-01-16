package com.example.demo.phonedirectory.daoImple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.Address;
import com.example.demo.beans.User;
import com.example.demo.phonedirectory.dao.PhoneDirectorySearch;

@Repository
public class PhoneDirectorySearchDaoImpl implements PhoneDirectorySearch {

	@Override
	public List<User> searchName(User user) {
		
		return loadUserList().stream().filter(p->p.getFirstName().toLowerCase().startsWith(user.getFirstName().toLowerCase()) 
				|| p.getMiddleName().toLowerCase().startsWith(user.getMiddleName().toLowerCase()) || 
				p.getLastName().toLowerCase().startsWith(user.getLastName()))
				.collect(Collectors.toList());
	}
	
	public List<User> loadUserList(){
		List<User> userList = new ArrayList<>();
		
		Address address1 = new Address("#3278/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user1 = new User("Chhotelal", "Prasad", "Gupta", address1, "9891074820");
		
		Address address2 = new Address("#3271/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user2 = new User("Ajay", "Kumar", "Gupta", address2, "9891074820");

		
		Address address3 = new Address("#3272/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user3 = new User("Ravi", "Kumar", "Sharma", address3, "9891074820");

		Address address4 = new Address("#3273/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user4 = new User("Kumar", "Sanu", "Gupta", address4, "9891074820");

		Address address5 = new Address("#3274/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user5 = new User("Rajan", "Kumar", "Singh", address5, "9891074820");

		Address address6 = new Address("#3275/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user6 = new User("Dhiraj", "Sing", "Rawat", address6, "9891074820");

		Address addres7 = new Address("#3276/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user7 = new User("Alok", "Balodi", "Rawat", addres7, "9891074820");

		Address address8 = new Address("#3277/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user8 = new User("Ashok", "Kumar", "Tiwari", address8, "9891074820");

		Address address9 = new Address("#3279/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user9 = new User("Akhilesh", "kumar", "Tiwari", address9, "9891074820");

		Address address10 = new Address("#3280/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user10 = new User("Vishal", "Kumar", "Gupta", address10, "9891074820");

		Address address11 = new Address("#3281/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user11 = new User("Somanath", "Laheri", "Gupta", address11, "9891074820");

		Address address12 = new Address("#3282/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user12 = new User("Tejashi", "Kumar", "Gupta", address12, "9891074820");

		Address address13 = new Address("#3283/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user13 = new User("Ramkrishana", "Singh", "Yadav", address13, "9891074820");

		Address address14 = new Address("#3284/1", "Sector-47D", "Chandigarh", "Chandigarh", 160047, "172-259765",
				"172-259799");

		User user14 = new User("Ranjana", "Kumari", "Gupta", address14, "9891074820");

		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		userList.add(user9);
		userList.add(user10);
		userList.add(user11);
		userList.add(user12);
		userList.add(user13);
		userList.add(user14);
		
		
		return userList;
		
	}

}
