package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.client.FindSeasoned;

@SpringBootApplication
public class BootProj01Application {
	
	@Bean(name="dt")
	public LocalDate  createLD() {  	
	   return  LocalDate.now();
    }

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(BootProj01Application.class, args);
		//get target spring bean class obj
		FindSeasoned finder=ctx.getBean("sf",FindSeasoned.class);
	    //invoke the business method
		String result = finder.seasonedFinder();
		System.out.println("Season Name ::"+result);
		((ConfigurableApplicationContext) ctx).close();
	}

}
