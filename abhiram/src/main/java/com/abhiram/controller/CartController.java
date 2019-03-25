package com.abhiram.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhiram.dao.cartDao;
import com.abhiram.dao.productDao;
import com.abhiram.model.Cart;
import com.abhiram.model.Product;



@Controller
public class CartController {
   
	
	
    
    @Autowired
    productDao pdao;
    
    @Autowired
    cartDao crd;
    
    
    @GetMapping("/cart")
    public ModelAndView goToCart(@RequestParam("proid") int Id, HttpSession session)
   {   
       System.out.println("cart");
      
          Product p=pdao.getProducts(Id);
       Cart c=new Cart();
       ModelAndView mv=new ModelAndView("cart");
       String loginUser=(String)session.getAttribute("uname");
       c.setCartId((int)(Math.random()*10000));
        c.setProductName(p.getProductName());
        c.setProductPrice(p.getProductPrice());
        c.setTotalPrice(p.getProductId());
        c.setQuantity(1);
        crd.addToCart(c);
        c.setCartUser(loginUser);
           return mv;

   }
    @RequestMapping("/getcartitems")
    public ModelAndView getCartItems()
    {
    	List<Cart> cartList =crd.getCartlist();
    	
    	ModelAndView mv=new ModelAndView("viewcart");
    	mv.addObject("cartList",cartList);
    	return mv;
    	
    }
    
    
}