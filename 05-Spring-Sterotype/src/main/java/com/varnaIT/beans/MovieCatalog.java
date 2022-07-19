package com.varnaIT.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MovieCatalog {
	Map<String, List<String>> moviesMap;
	
	public MovieCatalog() {
	moviesMap = new HashMap<>();
	List<String> teluguMovies = Arrays.asList("RRR","Bahubali");
	List<String> hindiMovies = Arrays.asList("PK","chakde");
	moviesMap.put("telugu",teluguMovies);
	moviesMap.put("hindi",hindiMovies);
	
	}
	
	public List<String>fetchMoviesByLanguage(String language){
		return moviesMap.get(language);
	}
}