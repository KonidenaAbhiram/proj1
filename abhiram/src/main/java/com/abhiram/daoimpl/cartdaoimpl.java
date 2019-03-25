package com.abhiram.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhiram.dao.cartDao;
import com.abhiram.model.Cart;
import com.abhiram.model.Product;

@Component
public class cartdaoimpl implements cartDao {
    @Autowired
    SessionFactory sessionFactory;
  Product p=new Product();
    @Override
    public void addToCart(Cart c) {
        
        System.out.println("SessionFactory"+sessionFactory);
        
        Session session=sessionFactory.openSession();
        //c.setCartId((int)(Math.random()*10000));
        session.save(c);
     Transaction transaction=session.beginTransaction();
        
        transaction.commit();
        session.close();
    }
    public List<Cart> getCartlist() {
        Session session=sessionFactory.openSession();
        Query query = session.createQuery("from Cart");
        List<Cart> cartList= query.list();
        session.close();
        return cartList;
            
    }
    
                }