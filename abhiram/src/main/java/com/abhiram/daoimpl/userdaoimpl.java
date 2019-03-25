package com.abhiram.daoimpl;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhiram.dao.userDao;
import com.abhiram.model.User;


@Component
public class userdaoimpl implements userDao
{

    @Autowired
    SessionFactory sessionFactory;
    
    
    public void addUser(User User)
    {
        System.out.println("ses"+sessionFactory);
        Session Session=sessionFactory.openSession();
        Session.save(User);
        org.hibernate.Transaction t=Session.beginTransaction();
        t.commit();
        

    }

    @Override
    public void getUser() {
        
    }
    

}