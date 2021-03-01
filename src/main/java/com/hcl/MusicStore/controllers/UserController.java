package com.hcl.MusicStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.MusicStore.entity.UserEntity;
import com.hcl.MusicStore.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	ModelAndView registerView = new ModelAndView("register");
	ModelAndView registersuccessfulView = new ModelAndView("registersuccessful");
	ModelAndView loginView = new ModelAndView("login");
	ModelAndView homeView = new ModelAndView("home");
	ModelAndView loginFailedView = new ModelAndView("loginfailed");
	
	@GetMapping(path = "/register")
	public ModelAndView register() {
		return registerView;
	}
	
	@PostMapping(path = "/registersuccessful")
	public ModelAndView successfulRegister(@ModelAttribute UserEntity userEntity) {
		userRepo.save(userEntity);
		return registersuccessfulView;
	}
	
	@GetMapping(path = "/login")
	public ModelAndView login() {
		return loginView;
	}

	@PostMapping(path = "/loginsuccessful")
	public ModelAndView successfulLogin(@ModelAttribute UserEntity userEntity) {
		Iterable<UserEntity> loginInfo = userRepo.findAll();
		for (UserEntity myEntity : loginInfo) {
			if (myEntity.getUserName().equals(userEntity.getUserName()) && myEntity.getUserPassword().equals(userEntity.getUserPassword())) {
				return homeView;
			}
		}
		return loginFailedView;
	}
	
	@GetMapping(path = "/home")
	public ModelAndView homePage() {
		return homeView;
	}
}
