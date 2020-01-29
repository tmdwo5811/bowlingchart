package com.palace.bowling_prj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping("/error")
	public String defaultError() {
		return "error/default";
	}
	
	@RequestMapping("error/no-resource")
	public String noResource() {
		return "error/noResource";
	}
	
	@RequestMapping("error/server-error")
	public String serverError() {
		return "error/serverError";
	}
}
