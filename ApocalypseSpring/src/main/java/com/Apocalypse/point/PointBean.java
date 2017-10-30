package com.Apocalypse.point;

import java.sql.Blob;

public class PointBean {

	private Integer productId;
	private String producName;
	private Integer price;
	private String productDesc;
	private Blob productPicture;
	
	public PointBean() {
		
	}

	public PointBean(Integer productId, String producName, Integer  price, String productDesc) {
		
		this.productId = productId;
		this.producName = producName;
		this.price = price;
		this.productDesc = productDesc;
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(Integer  productId) {
		this.productId = productId;
	}

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Blob getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(Blob productPicture) {
		this.productPicture = productPicture;
	}
	
}
