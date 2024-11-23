package com.nt.client;


import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class FindSeasoned {
	
	 @Autowired //field injection
	 private LocalDate date;
	 
	 public String seasonedFinder() {
		//get current month of the year
		 int month=date.getMonthValue();//1-12
		 //find the season name
		 if(month>=3 && month<=6) {
			 return "Summer season";
		 }
		 else if(month>=7 && month<=10) {
			 return "rainy season";
		 }
		 else {
			 return "Winter Season";
		 }
			 
	 }
	}

