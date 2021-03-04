package com.hcl.MusicStore.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hcl.MusicStore.entity.CartEntity;
import com.hcl.MusicStore.repositories.CartRepository;
import com.hcl.MusicStore.services.CartService;

@Controller
@SessionAttributes("products")
public class CartController {
	ModelAndView cartView = new ModelAndView("cart");
	ModelAndView homeView = new ModelAndView("home");

	@Autowired
	CartRepository cartRepo;

	@Autowired
	CartService cartService;

	@GetMapping(path = "/cart")
	public ModelAndView homePage(ModelMap modelMap, @ModelAttribute CartEntity cartEntity) {
		modelMap.put("products", cartService.GetAllProducts());
		return cartView;
	}

	@PostMapping(path = "/cart") 
	public RedirectView deleteItem(@ModelAttribute CartEntity cartEntity, HttpServletRequest request) {
		Iterable<CartEntity> newEntity = cartRepo.findAll();
		String ID = (String) request.getParameter("delete");
		for(CartEntity myEntity : newEntity) {
			if(myEntity.getCartID().equals(cartEntity.getCartID())) {
				cartRepo.deleteById(myEntity.getCartID());
			}
		}
		return new RedirectView ("cart");
	}

	@PostMapping(path = "/home")
	public ModelAndView homePage(@ModelAttribute CartEntity cartEntity) {
		cartRepo.save(cartEntity);
		return homeView;
	}

}
