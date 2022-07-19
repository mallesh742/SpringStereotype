package com.varnaIT.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varnaIT.beans.MovieLister;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		MovieLister lister = context.getBean("movieLister",MovieLister.class);
		lister.readMovies();
	}

}
