
package com.abhiram.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product
{
    @Id
    int productId;
    @Column
    String productName;
    @Column
    int productPrice;
    @Transient
    MultipartFile Image ; 
	
	public MultipartFile getImage() {
		return Image;
	}
	public void setImage(MultipartFile image) {
		Image = image;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

}
    
   