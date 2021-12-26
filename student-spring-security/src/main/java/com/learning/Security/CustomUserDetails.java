package com.learning.Security;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.learning.Entity.Role;
import com.learning.Entity.User;

public class CustomUserDetails implements UserDetails {

	private User databaseUser;
	
	public CustomUserDetails(User dbUser) {
		this.databaseUser=dbUser;
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<Role> rolesList=databaseUser.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		for(Role eachRole : rolesList) {
			authorities.add(new SimpleGrantedAuthority(eachRole.getName()));
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return databaseUser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return databaseUser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
