package com.hcl.MusicStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.MusicStore.entity.ProductsEntity;
import com.hcl.MusicStore.repositories.ProductRepository;

@Controller
public class ProductController {
	ModelAndView addproductView = new ModelAndView("addproduct");
	
	@Autowired
	ProductRepository productRepo;
	
	
	//Admin Functionality
	@GetMapping(path = "/addproduct")
	public ModelAndView products() {
		return addproductView;
	}
	
	@PostMapping(path = "/addproduct")
	public ModelAndView addProduct(@ModelAttribute ProductsEntity productEntity) {
		productRepo.save(productEntity);
		return addproductView;
	}
	
}
