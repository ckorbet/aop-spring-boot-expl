package com.cartorgon.aopsb;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cartorgon.aopsb.service.AspectService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopSpringBootExplApplication {
	
	@Autowired
	private AspectService service;
		
	public static final void main(final String[] args) {
		SpringApplication.run(AopSpringBootExplApplication.class, args);
	}
	
	@PostConstruct
	public final void callAspectService() {
		this.service.logAspectService("Carlos");
	}
}