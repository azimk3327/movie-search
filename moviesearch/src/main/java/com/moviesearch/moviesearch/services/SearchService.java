package com.moviesearch.moviesearch.services;

import java.util.List;

import com.moviesearch.moviesearch.beans.GenericResponse;
import com.moviesearch.moviesearch.beans.SearchCreateRequest;
import com.moviesearch.moviesearch.entities.MovieSearchEntity;

public interface SearchService {
	GenericResponse add(SearchCreateRequest request);
	List<MovieSearchEntity> get(String actor);
	

}
