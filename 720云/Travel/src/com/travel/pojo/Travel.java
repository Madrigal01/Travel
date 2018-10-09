package com.travel.pojo;

public class Travel {
	private String id;
	private String name;
	private String author;
	private String detail;
	private String image;
	private String category;
	private String address;
	public Travel() {
		super();
	}
	public Travel(String id, String name, String author, String detail, String image, String category, String address) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.detail = detail;
		this.image = image;
		this.category = category;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Travel [id=" + id + ", name=" + name + ", author=" + author + ", detail=" + detail + ", image=" + image
				+ ", category=" + category + ", address=" + address + "]";
	}

	
}
