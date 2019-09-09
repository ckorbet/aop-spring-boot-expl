package com.cartorgon.aopsb.service.impl;

import org.springframework.stereotype.Service;

import com.cartorgon.aopsb.service.AspectService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AspectServiceImpl implements AspectService {

	@Override
	public void logAspectService(String value) {
		log.info("I'm in the 'logAspectService' with args ['value':'" + value + "']");		
		log.info("Returning out from 'logAspectService'");
	}
}