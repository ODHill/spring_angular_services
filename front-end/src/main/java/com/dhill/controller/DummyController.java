package com.dhill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {
	
	@RequestMapping(value="/")
	public void fake() {
		
	}

}
