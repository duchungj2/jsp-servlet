package com.duchung.model;

import java.sql.Timestamp;

public class AbstractModel {
	
	private long id;
	
	private String createdBy;
	
	private String modifiesBy;
	
	private Timestamp createdDate;
	
	private Timestamp modifiedDate;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiesBy() {
		return modifiesBy;
	}

	public void setModifiesBy(String modifiesBy) {
		this.modifiesBy = modifiesBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
