package com.hcl.MusicStore.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.MusicStore.entity.CartEntity;
import com.hcl.MusicStore.entity.ProductsEntity;
import com.hcl.MusicStore.repositories.CartRepository;
import com.hcl.MusicStore.repositories.ProductRepository;
import com.hcl.MusicStore.services.ProductService;

@Controller
@SessionAttributes("products")
public class SearchController {
	ModelAndView searchView = new ModelAndView("search");
	ModelAndView searchResultView = new ModelAndView("searchresults");
	ModelAndView cartView = new ModelAndView("cart");
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartRepository cartRepo;
	
	@GetMapping(path = "/search")
	public ModelAndView search() {
		return searchView;
	}
	
	
	@PostMapping(path = "/search")
	public ModelAndView searchResult(ModelMap modelMap, HttpServletRequest request, @ModelAttribute ProductsEntity productEntity) {
		String myString = request.getParameter("search");
		Iterable<ProductsEntity> productInfo = productRepo.findAll();
		for (ProductsEntity myEntity : productInfo) {
			if (myEntity.getProductName().contains(myString)) {
				modelMap.put("products", myEntity);
			}
		}
		return searchResultView;
		
	}
	
	@PostMapping(path = "/searchresults")
	public ModelAndView addToCartFromSearch(@ModelAttribute CartEntity cartEntity) {
		cartRepo.save(cartEntity);
		return searchResultView;
	}
	
}
