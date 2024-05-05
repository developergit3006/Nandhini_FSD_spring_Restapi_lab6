package com.greatlearning.ssrsm.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.ssrsm.security.entity.SsrsmUserDetails;
import com.greatlearning.ssrsm.security.entity.Users;
import com.greatlearning.ssrsm.security.repository.UserRepository;

public class SsrsmUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new SsrsmUserDetails(user);
	}
}