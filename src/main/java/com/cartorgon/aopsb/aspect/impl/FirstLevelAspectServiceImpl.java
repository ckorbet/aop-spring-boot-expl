package com.cartorgon.aopsb.aspect.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.cartorgon.aopsb.aspect.FirstLevelAspect;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class FirstLevelAspectServiceImpl implements FirstLevelAspect {
	
	@Override
	@Before(value = "execution(* com.cartorgon.aopsb.AopSpringBootExplApplication.main*(..)) and args(args)")
	public void logFirstLevelBefore(JoinPoint joinPoint, String value) {
		log.info("I'm in 'logFirstLevelBefore' with args ['value':'" + value + "']");
		log.info("Returning out from 'logFirstLevelBefore'");
	}

	@Override
	@After(value = "execution(* com.cartorgon.aopsb.AopSpringBootExplApplication.main*(..)) and args(args)")
	public void logFirstLevelAfter(JoinPoint joinPoint, String value) {
		log.info("I'm in 'logFirstLevelAfter' with args ['value':'" + value + "']");
		log.info("Returning out from 'logFirstLevelAfter'");		
	}
}