package org.spring.core.services;

public class FortuneServiceImpl implements FortuneService {

	public String getFortune(String coach) {
		return String.format("This is the %s fortune!", coach);
	}

}
