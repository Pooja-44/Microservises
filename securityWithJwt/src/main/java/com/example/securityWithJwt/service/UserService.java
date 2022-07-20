package com.example.securityWithJwt.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.securityWithJwt.Entity.User;
import com.example.securityWithJwt.repository.UserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired(required=true)
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=repo.findByUserName(username);
		return   new org.springframework.security.core.userdetails .User(user.getUserName(),user.getPassword(),new ArrayList<>());
	}

}
