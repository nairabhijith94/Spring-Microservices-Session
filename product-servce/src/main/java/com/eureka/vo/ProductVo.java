package com.eureka.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class ProductVo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@NotBlank
	String productID;
	@NotBlank(message = "Product name cannot be null")
	String productName;
	@NotBlank
	String productBigImage;
	@NotBlank
	String productThumbnail;
	@NotBlank
	String productDescription;
	@NotBlank
	String productShortDescription;
	float productRating;
	@NotNull(message = "Canot be null")
	float price;
	@NotNull
	boolean isActive;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBigImage() {
		return productBigImage;
	}
	public void setProductBigImage(String productBigImage) {
		this.productBigImage = productBigImage;
	}
	public String getProductThumbnail() {
		return productThumbnail;
	}
	public void setProductThumbnail(String productThumbnail) {
		this.productThumbnail = productThumbnail;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductShortDescription() {
		return productShortDescription;
	}
	public void setProductShortDescription(String productShortDescription) {
		this.productShortDescription = productShortDescription;
	}
	public float getProductRating() {
		return productRating;
	}
	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	

}
