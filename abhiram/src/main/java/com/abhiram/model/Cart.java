package com.abhiram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cart {
    @Id
    int CartId;
    @Column
    String ProductName;
    @Column
    int ProductPrice;
    @Column
    int TotalPrice;
    @Column
    int Quantity;
    @Column
    String cartUser ;
    public String getCartUser() {
		return cartUser;
	}
	public void setCartUser(String cartUser) {
		this.cartUser = cartUser;
	}
	public int getCartId() {
        return CartId;
    }
    public void setCartId(int cartId) {
        CartId = cartId;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getProductPrice() {
        return ProductPrice;
    }
    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }
    public int getTotalPrice() {
        return TotalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}

