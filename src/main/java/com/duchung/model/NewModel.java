package com.duchung.model;

public class NewModel extends AbstractModel<NewModel>{
	
	private String title;
	
	private String thumbnail;
	
	private String shortDescription;
	
	private String content;
	
	private long categoryId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String toString() {
	    return super.toString() + ", title: " + title + ", thumbnail: " + thumbnail + ", shortDescription: " + shortDescription + ", content: " + content + ", categoryId: " + categoryId;
	}
	
}
