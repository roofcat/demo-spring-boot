package com.crojas.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crojas.demo.model.User;
import com.crojas.demo.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	
	@GetMapping("")
	public ModelAndView index() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName( "users/index" );
		mav.addObject( "users", service.getUsers() );
		
		return mav;
		
	}
	
	
	@GetMapping("/new")
	public ModelAndView newUser() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName( "users/new" );
		mav.addObject( "user", new User() );
		mav.addObject( "profiles", this.getProfiles() );
		
		return mav;
		
	}
	
	@PostMapping("/create")
	public ModelAndView createUser( @Valid User user, BindingResult result ) {
		
		System.out.println( "USER ID: " + user.getUserId() );
		System.out.println( "USER NAME: " + user.getUserName() );
		System.out.println( "USER GENDER: " + user.getGender() );
		System.out.println( "USER MARRIED: " + user.getMarried() );
		System.out.println( "USER PROFILE: " + user.getProfile() );
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println(result.hasErrors());
		
		if ( result.hasErrors() ) {
			
			System.out.println( "Validation errors!!" );
			
			mav.setViewName( "users/new" );
			mav.addObject( "user", user );
			mav.addObject( "profiles", this.getProfiles() );
			
			return mav;
			
		}
		
		service.addUser( user );
		
//		mav.setViewName( "users/new" );
		return new ModelAndView( "redirect:/users" );
		
	}
	
	
	private List<String> getProfiles() {
		
		List<String> profiles = new ArrayList<String>();
		
		profiles.add( "Developer" );
		profiles.add( "Manager" );
		profiles.add( "Director" );
		
		return profiles;
		
	}
	
	
}
