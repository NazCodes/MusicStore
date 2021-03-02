package com.hcl.MusicStore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutController {
	
	@GetMapping(path = "/checkout")
	public String checkout() {
		return "checkout";
	}
}
