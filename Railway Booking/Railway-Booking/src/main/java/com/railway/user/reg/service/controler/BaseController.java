package com.railway.user.reg.service.controler;

import org.springframework.beans.factory.annotation.Autowired;

import com.railway.user.reg.service.util.RepositoryRegistry;
import com.railway.user.reg.service.util.ServiceRegistry;

import lombok.Getter;

@Getter
public class BaseController {
	
	@Autowired
	ServiceRegistry serviceRegistry;
	
	@Autowired
	RepositoryRegistry repositoryRegistry;
}
