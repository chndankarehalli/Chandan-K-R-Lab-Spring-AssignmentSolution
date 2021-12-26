package com.learning.Controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.learning.Entity.User;
import com.learning.Repository.UserRepository;
import com.learning.Security.CustomUserDetails;

public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User dbUser = userRepository.findByUsername(username);
		if (dbUser == null) {
			throw new UsernameNotFoundException("Cannot find the user!");
		}
		return new CustomUserDetails(dbUser);
	}

}
