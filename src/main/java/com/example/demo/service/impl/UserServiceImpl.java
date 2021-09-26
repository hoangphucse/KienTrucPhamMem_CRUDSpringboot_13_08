package com.example.demo.service.impl;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auth.Userprincipal;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.saveAndFlush(user);
	}


	@Override
	public Userprincipal findByUsername(String username) {
		User user = userRepository.findByUsername(username);
		Userprincipal userPrincipal = new Userprincipal();

		if (null != user) {
			Set<String> authorities = new HashSet<>();
			if (null != user.getRoles())

				user.getRoles().forEach(r -> {
					authorities.add(r.getRoleKey());
					r.getPermissions().forEach(p -> authorities.add(p.getPermissionKey()));
				});

			userPrincipal.setUserId(user.getId());
			userPrincipal.setUsername(user.getUsername());
			userPrincipal.setPassword(user.getPassword());
			userPrincipal.setAuthorities(authorities);
		}

		return userPrincipal;
	}

}
