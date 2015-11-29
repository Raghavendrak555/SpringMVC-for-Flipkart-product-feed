package com.enixta.tv.model;
 
public class Television {
	
    private String id;
    private String title;
    private int MRP; 
    private int SP; // selling price
    private String url;
    private String brand;
    private String imageUrl;
    
 
    public Television() {
    }
 
    public Television(String id, String title, int MRP, int SP, String url, String brand, String imageUrl ) {
       this.id = id;
       this.title = title;
       this.MRP = MRP;
       this.SP = SP;
       this.url = url;
       this.brand = brand;
       this.imageUrl = imageUrl;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMRP() {
		return MRP;
	}

	public void setMRP(int mRP) {
		MRP = mRP;
	}

	public int getSP() {
		return SP;
	}

	public void setSP(int sP) {
		SP = sP;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
 
    // getters and setters
}