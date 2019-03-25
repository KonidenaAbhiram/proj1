package com.abhiram.dao;

import java.util.List;

import com.abhiram.model.Product;


public interface productDao
{
    public  void addProduct(Product p);
    List<Product> getProducts();
    
    Product getProducts(int Id);
}