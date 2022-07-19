package com.varnaIT.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MovieLister {
	
	@Autowired
	MovieCatalog movieCatalog;
	
	@Value("hindi")
	String language;
	public void readMovies() {
		
		List<String> lst = movieCatalog.fetchMoviesByLanguage(language);
		lst.forEach(System.out::println);
	}
	

}
