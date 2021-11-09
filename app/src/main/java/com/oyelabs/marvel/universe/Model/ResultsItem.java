package com.oyelabs.marvel.universe.Model;

import java.util.List;

public class ResultsItem{
	private List<UrlsItem> urls;
	private Thumbnail thumbnail;
	private Stories stories;
	private Series series;
	private Comics comics;
	private String name;
	private String description;
	private String modified;
	private String id;
	private String resourceURI;
	private Events events;

	public List<UrlsItem> getUrls(){
		return urls;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public Stories getStories(){
		return stories;
	}

	public Series getSeries(){
		return series;
	}

	public Comics getComics(){
		return comics;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public String getModified(){
		return modified;
	}

	public String getId(){
		return id;
	}

	public String getResourceURI(){
		return resourceURI;
	}

	public Events getEvents(){
		return events;
	}
}