package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
			@Autowired
			CategoryService categoryService;			
			@RequestMapping("listCategory")
			public ModelAndView listCategory(Page page) {
					ModelAndView mav = new ModelAndView();
					int total = categoryService.total();
					page.caculateLast(total);
					List<Category> cs = categoryService.list(page);
					mav.addObject("cs",cs);
					mav.setViewName("listCategory");
					return mav;
			}
			@RequestMapping("edit")
			public ModelAndView edit(Category category) {
					Category c = categoryService.get(category);
					ModelAndView mav = new ModelAndView("editCategory");
					mav.addObject("c", c);
					return mav;
			}
			@RequestMapping("update")
			public ModelAndView update(Category category) {
					categoryService.update(category);
					ModelAndView mav = new ModelAndView("redirect:/listCategory");
					return mav;
			}
}
