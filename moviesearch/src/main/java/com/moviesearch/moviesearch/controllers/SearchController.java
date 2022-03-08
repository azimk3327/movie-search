package com.moviesearch.moviesearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviesearch.moviesearch.beans.GenericResponse;
import com.moviesearch.moviesearch.beans.SearchCreateRequest;
import com.moviesearch.moviesearch.entities.MovieSearchEntity;
import com.moviesearch.moviesearch.services.SearchService;

@RestController
public class SearchController {
	@Autowired
	SearchService searchservice;
	@PostMapping("/create")
	public  GenericResponse add(@RequestBody SearchCreateRequest request) {
		GenericResponse response=searchservice.add(request);
		return response;
	}
	
	@GetMapping("/get")
	public  List<MovieSearchEntity> get(@RequestParam String actor) {
		List<MovieSearchEntity> response=searchservice.get(actor);
		return response;
	}

	

}
