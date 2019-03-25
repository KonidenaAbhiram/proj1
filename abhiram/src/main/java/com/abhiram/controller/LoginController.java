package com.abhiram.controller;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class LoginController
{
     @RequestMapping("/Login")
     public String  ulogin()
     {
    	 System.out.println("hi");
         return "Login";
     }
    
     @RequestMapping("/on_login_success")
    
         public String onLoginSucess()
         {
    	 Authentication authentication=
    			 SecurityContextHolder.getContext().getAuthentication();
    	 String un=authentication.getName();
    	 session.setAttribute("uname",un);

    			 //get All authurities
    			     Collection<GrantedAuthority> list= (Collection<GrantedAuthority>)authentication.getAuthorities();
    			     String page="";
    			 //check authories with ROLE_USER and ROLE_ADMIN
    			     for(GrantedAuthority authoritie:list)
    			     {
    			         if(authoritie.getAuthority().equals("ROLE_USER"))
    			         {
    			             page="guesthome";
    			         }
    			         else
    			         {
    			             page="adminhome";
    			         }
    			     }
    			     return page;  
        
         }
     

}