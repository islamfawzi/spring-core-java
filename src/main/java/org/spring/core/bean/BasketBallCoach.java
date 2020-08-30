package org.spring.core.bean;

import org.spring.core.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${coach.basketball}")
	private String sport;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getFortune() {
		return fortuneService.getFortune(sport);
	}

	public String getDailyWork() {
		return "Playing BasketBall!!";
	}

}
