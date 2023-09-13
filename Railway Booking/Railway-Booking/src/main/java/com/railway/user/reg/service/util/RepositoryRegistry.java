package com.railway.user.reg.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.railway.user.reg.service.repository.UserDetailsRepository;

import lombok.Getter;

@Component
@Getter
public class RepositoryRegistry {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
}
