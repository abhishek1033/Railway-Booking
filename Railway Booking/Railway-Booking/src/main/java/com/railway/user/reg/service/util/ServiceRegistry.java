package com.railway.user.reg.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.railway.user.reg.service.service.UserDetailsService;

import lombok.Getter;

@Component
@Getter
public class ServiceRegistry 
{
	@Autowired
	private UserDetailsService userDetailsService;
}
