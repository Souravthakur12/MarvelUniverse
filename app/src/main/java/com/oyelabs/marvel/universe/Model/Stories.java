package com.oyelabs.marvel.universe.Model;

import java.util.List;

public class Stories{
	private String collectionURI;
	private String available;
	private String returned;
	private List<ItemsItem> items;

	public String getCollectionURI(){
		return collectionURI;
	}

	public String getAvailable(){
		return available;
	}

	public String getReturned(){
		return returned;
	}

	public List<ItemsItem> getItems(){
		return items;
	}
}