package com.abhiram.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.abhiram.model.Category;
@Controller
public class CategoryController
{
    @RequestMapping("/Categories")
    public ModelAndView goToFormCategories()
    {
        ModelAndView mav=new ModelAndView("Categories");
        mav.addObject("cat",new Category());
        return mav;
    }
    @RequestMapping(value="/addCat",method=RequestMethod.POST)
    public String saveCategory(@ModelAttribute("cat") Category c)
    {
        System.out.println(c.getCategoryId());
        System.out.println(c.getCategoryName());
        System.out.println(c.getCategoryDescription());
        
                
                
                return "addCategory";
    }
}
