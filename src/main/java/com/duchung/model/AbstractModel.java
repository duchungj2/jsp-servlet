package com.duchung.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AbstractModel<T> {
	
	private long id;
	
	private String createdBy;
	
	private String modifiedBy;
	
	private Timestamp createdDate;
	
	private Timestamp modifiedDate;

	private List<Integer> ids = new ArrayList<>();
	
	private int page = 1;
	
	private int maxPageItem = 5;
	
	private int totalPage;
	
	private int totalItem;
	
	private List<T> listResult = new ArrayList<>();
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getMaxPageItem() {
		return maxPageItem;
	}

	public void setMaxPageItem(int maxPageItem) {
		this.maxPageItem = maxPageItem;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

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
	
	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public String toString() {
	    return "id: " + id + ", createdBy: " + createdBy + ", createdDate: " + createdDate + ", modifiedBy: " + modifiedBy + ", modifiedDate: " + modifiedDate;
	}
}
