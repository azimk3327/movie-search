package com.moviesearch.moviesearch.beans;

public class SearchCreateRequest {
	private String title;
	private String actors;
	private String acteress;
	private String description;
	private String language;
	private long  view;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getActeress() {
		return acteress;
	}
	public void setActeress(String acteress) {
		this.acteress = acteress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getView() {
		return view;
	}
	public void setView(long view) {
		this.view = view;
	}
	

}
