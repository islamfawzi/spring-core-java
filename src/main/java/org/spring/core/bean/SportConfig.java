package org.spring.core.bean;

import org.spring.core.services.FortuneService;
import org.spring.core.services.FortuneServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportConfig {

	/** create bean instance with beanId = footballCoach  **/
	@Bean
	public FootballCoach footballCoach() {
		
		/** inject fortuneService using constructor injection **/
		return new FootballCoach(fortuneService());
	}
	
	/** create bean instance with beanId = fortuneService **/
	@Bean 
	public FortuneService fortuneService() {
		return new FortuneServiceImpl();
	}

}
