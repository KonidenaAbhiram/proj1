package com.abhiram.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.abhiram.dao.productDao;
import com.abhiram.model.Product;

@Controller
public class ProductController {
    @Autowired
    productDao daoImpl;
                @RequestMapping("/Products")
        public ModelAndView goToForm()
                {
                    ModelAndView mv=new ModelAndView("Products");
                
            mv.addObject("pr",new Product());
              return mv;

              }
    @RequestMapping("/adminhome")
            public ModelAndView goTo()
            {
                ModelAndView m=new ModelAndView("Products");
            
        m.addObject("pr",new Product());
          return m;

          }

                                                       //formsub
        @RequestMapping(value="/addproduct",method=RequestMethod.POST)
          public String saveProduct(@ModelAttribute("pr")Product pro)
          {
            System.out.println(""+pro.getProductId());
            System.out.println(""+pro.getProductName());
            System.out.println(""+pro.getProductPrice());
           
            daoImpl.addProduct((pro)); 
            
           
    		MultipartFile image= pro.getImage();
    		  
    			byte imagearray[];
				try {
					imagearray = image.getBytes();
				
    		
    		String path="C:/abhiram/src/main/webapp/resources/proimg/";
    		path=path+pro.getProductId()+".png";
    		System.out.println("img---------------"+image);
    		if(image!=null)
    		{
    			System.out.println("img---------------"+image);
    			File file=new File(path);
    			FileOutputStream  fos=new FileOutputStream(file);
    			BufferedOutputStream  bos=new BufferedOutputStream(fos);
    			
    			bos.write(imagearray);
                bos.close();		
    		} 
				}
				catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
    			
    		return "adminhome";
    		
          }
    			
    		
            
         
    			
    			//image.transferTo(new File(path));
    		
    		
          
          


       

        @RequestMapping("/v")
        public ModelAndView getProducts()
        {
            List<Product> productList=daoImpl.getProducts();
            ModelAndView mv=new ModelAndView("viewproducts","pro",productList);

            mv.addObject(productList);
            System.out.println("productList");
            return mv;
        }
        
        
        @RequestMapping("/viewdetails")
        public ModelAndView goToSingle()
{
    ModelAndView mv=new ModelAndView("single");
return mv;
}

        @GetMapping("/viewproducts")

       public ModelAndView showSingleProduct(@RequestParam("proid") int Id)
        {
            //List<Product4> productList=daoImpl.getProducts();
                       //calling method
           Product p1=daoImpl.getProducts(Id);
            ModelAndView mv=new ModelAndView("single","pro",p1);
            return mv;

        }
        @RequestMapping("/adminproduct")
        public ModelAndView adminProducts()
        {
            List<Product> productList=daoImpl.getProducts();
            ModelAndView mv=new ModelAndView("adminproduct","pro",productList);

            mv.addObject(productList);
            System.out.println("productList");
            return mv;
        }

}