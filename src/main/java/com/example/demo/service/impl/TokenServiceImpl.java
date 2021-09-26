package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Token;
import com.example.demo.repo.TokenRepository;
import com.example.demo.service.TokenService;

@Service
public class TokenServiceImpl implements TokenService {

	@Autowired
	private TokenRepository tokenRepository;

	@Override
	public Token createToken(Token token) {
		  return tokenRepository.saveAndFlush(token);
	}

	@Override
	public Token findByToken(String token) {
		  return tokenRepository.findByToken(token);
	}

}
