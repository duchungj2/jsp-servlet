package com.duchung.model;

public class CategoryModel extends AbstractModel{
	
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
	
	public String toString() {
	    return super.toString() + ", name: " + name + ", code: " + code;
	  }
}
