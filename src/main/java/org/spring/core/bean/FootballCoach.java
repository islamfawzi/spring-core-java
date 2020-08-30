package org.spring.core.bean;

import org.spring.core.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${coach.football}")
	private String sport;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWork() {
		return "Playing Football!";
	}

	public String getFortune() {
		return fortuneService.getFortune(sport);
	}

}
