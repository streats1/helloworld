package com.hw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworld {
@RequestMapping("/")
public String home() {
	return "NewFile";
	
}
}
