package com.abhiram.daoimpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.abhiram.dao.productDao;
import com.abhiram.model.Product;


@Component
public  class productdaoimpl implements productDao {
@Autowired
SessionFactory sessionFactory;

@Override
public void addProduct(Product p) {
    
    System.out.println("SessionFactory"+sessionFactory);
    
    Session session=sessionFactory. openSession();
    p.setProductId((int)(Math.random()*10000));
    session.save(p);
Transaction transaction=session.beginTransaction();
    
    transaction.commit();
    session.close();
}

@Override
public List<Product> getProducts() {
    
Session session=sessionFactory.openSession();
Query query = session.createQuery("from Product");
List<Product> productList= query.list();
return productList;
    
}
@Override
public Product getProducts(int Id) {
    Session session=sessionFactory. openSession();
    Product p=new Product();
    p=session.get(Product.class,Id);
    //session.save(p);
     Transaction transaction=session.beginTransaction();
        
        transaction.commit();
        return p;
}
}