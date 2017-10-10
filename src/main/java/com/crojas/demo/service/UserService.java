package com.crojas.demo.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.crojas.demo.model.User;


@Service
public class UserService {
	
	
	private Collection<User> users = new ArrayList<User>();
	
	
	public Collection<User> getUsers() {
		return this.users;
	}
	
	
	public void addUser( User user ) {
		this.users.add( user );
	}
	
	
}
