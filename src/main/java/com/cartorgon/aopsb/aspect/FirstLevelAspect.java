package com.cartorgon.aopsb.aspect;

import org.aspectj.lang.JoinPoint;

public interface FirstLevelAspect {
	void logFirstLevelBefore(JoinPoint joinPoint,  String value);
	void logFirstLevelAfter(JoinPoint joinPoint,  String value);
}