package com.leetcode.arrays;

public class DVD {
	
	private String name;
	private int release_year;
	private String director;
	public DVD(String name, int release_year, String director) {
		super();
		this.name = name;
		this.release_year = release_year;
		this.director = director;
	}
	@Override
	public String toString() {
		return "DVD [name=" + name + ", release_year=" + release_year + ", director=" + director + "]";
	}
	
	

}
