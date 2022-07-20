package com.jwtTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jwtTest.config.JwtTokenUtil;


@RestController
public class JwtAuthenticationController {

	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password)
			throws Exception {
	if(!username.equals("abcd") || !password.equals("1234"))
	   return ResponseEntity.ok("Invalid credential");
   
	   final UserDetails userDetails = userDetailsService
				.loadUserByUsername(username);
        final String token = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(token);
	}
   @RequestMapping({ "/hello" })
	public String hello() {
		return "Hello JWT";
	}
}
