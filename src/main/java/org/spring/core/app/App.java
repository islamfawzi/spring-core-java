package org.spring.core.app;

import java.util.logging.Logger;

import org.spring.core.bean.Coach;
import org.spring.core.bean.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private final static Logger logger = Logger.getLogger(App.class.getName()); 
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// inject FootballCoach Bean
		Coach footballCoach = applicationContext.getBean("footballCoach", Coach.class);
		
		logger.info(footballCoach.getDailyWork());
		
		logger.info(footballCoach.getFortune());
		
		Coach footballCoach2 = applicationContext.getBean("footballCoach", Coach.class);
		
		/** Test Bean scopes **/
		logger.info("is the same object: " + (footballCoach == footballCoach2));
		
		
		/** inject BasketBallCoach Bean **/
		Coach basketBallCoach = applicationContext.getBean("basketBallCoach", Coach.class);
		
		logger.info(basketBallCoach.getFortune());
		
		// clean up
		applicationContext.close();
		
	}
}
