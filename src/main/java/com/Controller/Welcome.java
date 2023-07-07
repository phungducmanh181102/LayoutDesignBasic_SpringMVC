package com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import layoutDesign.components.*;

@Controller
@RequestMapping("/welcome")
public class Welcome {

	@RequestMapping("")
	public String noLayout(HttpServletRequest request) {
		return "welcome";
	}
}
