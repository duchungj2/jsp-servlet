package com.duchung.model;

import java.sql.Timestamp;

public class AbstractModel {
	
	private long id;
	
	private String createdBy;
	
	private String modifiedBy;
	
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
		return modifiedBy;
	}

	public void setModifiesBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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
	
	public String toString() {
	    return "id: " + id + ", createdBy: " + createdBy + ", createdDate: " + createdDate + ", modifiedBy: " + modifiedBy + ", modifiedDate: " + modifiedDate;
	}
}
