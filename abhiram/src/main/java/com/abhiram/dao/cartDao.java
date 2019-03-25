package com.abhiram.dao;



import java.util.List;

import com.abhiram.model.Cart;

public interface cartDao {
    public  void addToCart(Cart c);
    
	

	public List<Cart> getCartlist();
    



}