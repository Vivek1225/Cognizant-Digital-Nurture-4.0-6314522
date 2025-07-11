package com.cognizant.springlearn.model;

public class Country {
	private String name;
	private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}
	public Country(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public Country() {
		
	}
	
}
