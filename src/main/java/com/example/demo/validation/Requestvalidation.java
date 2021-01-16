package com.example.demo.validation;

import java.util.regex.Pattern;

import com.example.demo.beans.User;
import com.example.demo.constants.Constant;

public class Requestvalidation {
	
	public static boolean validateUser(User user) {
		boolean firstnamevalidation =Pattern.matches(Constant.REGULAR_ExPRESSION,user.getFirstName());
		boolean middlenamevalidation =Pattern.matches(Constant.REGULAR_ExPRESSION,user.getMiddleName());
		boolean lastnamevalidation =Pattern.matches(Constant.REGULAR_ExPRESSION,user.getLastName());
		return firstnamevalidation || middlenamevalidation || lastnamevalidation;
		
	}

}
