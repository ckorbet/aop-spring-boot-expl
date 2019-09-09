package com.cartorgon.aopsb.aspect;

import org.aspectj.lang.JoinPoint;

public interface SecondLevelAspect {
	void logSecondLevelBefore(JoinPoint joinPoint,  String value);
	void logSecondLevelAfter(JoinPoint joinPoint,  String value);
}