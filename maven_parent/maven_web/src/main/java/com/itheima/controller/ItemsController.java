package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public ModelAndView find(ModelAndView modelAndView){
        Items items = itemsService.findById(1);
        System.out.println(items);
        modelAndView.addObject("item",items);
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }

}
