package com.example.demo1;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "*")
public class TvServiceController {
	@RequestMapping("/tv")
	public Map<String,Object> sayHello(HttpServletRequest res,HttpServletResponse resp){
		System.out.println(res.getHeader("token"));
		resp.setHeader("token1","000");
		Cookie cookie = new Cookie("sessionid","222");
		resp.addCookie(cookie);
	 Map<String,Object> result = new HashMap<String,Object>();
	 result.put("message", "hello world");
	 return result;
 }


	@RequestMapping("/tv/{id}")
	public Map<String,Object> sayHello1(@PathVariable(value = "id")Integer id){
		System.out.println("**##*"+id);

	 Map<String,Object> result = new HashMap<String,Object>();
	 result.put("message", "hello world11233");
	 return result;
 }
}
