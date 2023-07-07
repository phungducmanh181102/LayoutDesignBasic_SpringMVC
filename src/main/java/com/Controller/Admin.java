package com.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import layoutDesign.components.*;

@Controller
@RequestMapping("/admin")
public class Admin {

	//Bắt đầu khu vực 1. Tạo @ModelAttribute("layout")
		@Autowired
		@Qualifier("adminLayout")
		private Layout adminLayout;
	
		@ModelAttribute("layout")
		public Layout modelAttributeLayout() {
			return adminLayout;
		}
	//Kết thúc khu vực 1
	
	//Bắt đầu khu vực 2. Tạo @ModelAttribute("styles")
	@ModelAttribute("styles")
	public String[] styles() {
		return new String[]{"bootstrap.min.css"};
	}
	//Kết thúc khu vực 2
	
	@RequestMapping("/layout")
	public String haveLayout(HttpServletRequest request) {
		return "home";
	}
	
	@RequestMapping("/noLayout")
	public String noLayout(HttpServletRequest request) {
		request.setAttribute("layout", false);
		return "page/admin/home";
	}
}
