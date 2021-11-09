package com.oyelabs.marvel.universe.Model;

import java.util.List;

public class Data{
	private String total;
	private String offset;
	private String limit;
	private String count;
	private List<ResultsItem> results;


	public String getTotal(){
		return total;
	}

	public String getOffset(){
		return offset;
	}

	public String getLimit(){
		return limit;
	}

	public String getCount(){
		return count;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}