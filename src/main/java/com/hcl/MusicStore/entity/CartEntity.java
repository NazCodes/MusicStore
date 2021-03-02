package com.hcl.MusicStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CartID")
	private Long cartID;
	
	@Column(name = "ProductName")
	private String productName;
	
	@Column(name = "ProductDescription")
	private String productDescription;
	
	@Column(name = "ProductImage")
	private String productImage;
	
	@Column(name = "ProductPrice")
	private float productPrice;
	
	
	public float getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}



	public Long getCartID() {
		return cartID;
	}



	public void setCartID(Long cartID) {
		this.cartID = cartID;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}



	public String getProductImage() {
		return productImage;
	}



	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}



	@Override
	public String toString() {
		return "CartEntity [cartID=" + cartID + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productImage=" + productImage + ", productPrice=" + productPrice + "]";
	}

	
}
