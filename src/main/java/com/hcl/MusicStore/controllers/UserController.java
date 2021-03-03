package com.hcl.MusicStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.MusicStore.entity.ProductsEntity;
import com.hcl.MusicStore.entity.UserEntity;
import com.hcl.MusicStore.repositories.ProductRepository;
import com.hcl.MusicStore.repositories.UserRepository;
import com.hcl.MusicStore.services.ProductService;

@Controller
@SessionAttributes("products")
public class UserController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	ModelAndView registerView = new ModelAndView("register");
	ModelAndView registersuccessfulView = new ModelAndView("registersuccessful");
	ModelAndView loginView = new ModelAndView("login");
	ModelAndView homeView = new ModelAndView("home");
	ModelAndView loginFailedView = new ModelAndView("loginfailed");
	
	@GetMapping(path = "/register")
	public ModelAndView register() {
		return registerView;
	}
	
	@PostMapping(path = "/login")
	public ModelAndView successfulRegister(@ModelAttribute UserEntity userEntity) {
		userRepo.save(userEntity);
		return loginView;
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
	public ModelAndView homePage(ModelMap modelMap, @ModelAttribute ProductsEntity productEntity) {
		modelMap.put("products", productService.GetAllProducts());
		return homeView;
	}
}
