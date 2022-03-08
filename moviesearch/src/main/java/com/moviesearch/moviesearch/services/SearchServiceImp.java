package com.moviesearch.moviesearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviesearch.moviesearch.beans.GenericResponse;
import com.moviesearch.moviesearch.beans.SearchCreateRequest;
import com.moviesearch.moviesearch.dao.SearchRepository;
import com.moviesearch.moviesearch.entities.MovieSearchEntity;

@Service
public class SearchServiceImp implements SearchService{
	
	@Autowired
	SearchRepository searchrepository;
	@Override
	public GenericResponse add(SearchCreateRequest request) {
		GenericResponse response=new GenericResponse();
		MovieSearchEntity movieSearchEntity=new MovieSearchEntity();
		
		movieSearchEntity.setTitle(request.getTitle());
		movieSearchEntity.setActors(request.getActors());
		movieSearchEntity.setActeress(request.getActeress());
		movieSearchEntity.setDescription(request.getDescription());
		movieSearchEntity.setLanguage(request.getLanguage());
		movieSearchEntity.setView(request.getView());
	
		
		try {
		searchrepository.save(movieSearchEntity);
		response.setStatus("SUCESS");
		}catch(Exception e) {
			response.setStatus("FAILURE");
			response.setReasion(e.getMessage());
		}
		return response;
	}
	public List<MovieSearchEntity> get(String actors) {
		List<MovieSearchEntity> list =searchrepository.findByActors(actors);
		return list;
			}



}
