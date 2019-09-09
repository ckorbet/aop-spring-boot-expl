package com.cartorgon.aopsb.aspect.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.cartorgon.aopsb.aspect.SecondLevelAspect;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class SecondLevelAspectServiceImpl implements SecondLevelAspect {
	
	@Override
	@Before(value = "execution(* com.cartorgon.aopsb.aspect.FirstLevelAspect.logFirstLevelBefore*(..)) and args(value)")
	public void logSecondLevelBefore(JoinPoint joinPoint, String value) {
		log.info("I'm in 'logSecondLevelBefore' with args ['value':'" + value + "']");
		log.info("Returning out from 'logSecondLevelBefore'");
	}

	@Override
	@After(value = "execution(* com.cartorgon.aopsb.aspect.FirstLevelAspect.logFirstLevelAfter*(..)) and args(value)")
	public void logSecondLevelAfter(JoinPoint joinPoint, String value) {
		log.info("I'm in 'logSecondLevelAfter' with args ['value':'" + value + "']");
		log.info("Returning out from 'logSecondLevelAfter'");		
	}
}