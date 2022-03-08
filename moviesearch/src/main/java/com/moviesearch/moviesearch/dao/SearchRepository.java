package com.moviesearch.moviesearch.dao;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.moviesearch.moviesearch.entities.MovieSearchEntity;
@Repository
public interface SearchRepository extends ElasticsearchRepository<MovieSearchEntity, String>{ 
	
	

	List<MovieSearchEntity> findByActors(String actors);


}
