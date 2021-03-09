package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.pojo.Product;
import com.ssm.service.*;

@Controller
@RequestMapping("")
public class ProductController {
		@Autowired
		private CategoryService categoryService;
		@Autowired
		private ProductService productService;
		
		@RequestMapping("listProduct")
		public ModelAndView list(Page page) {
			ModelAndView mav = new ModelAndView();
			int total = productService.total();
			page.caculateLast(total);
			List<Product> ps = productService.listProduct(page);
			mav.addObject("ps", ps);
			mav.setViewName("listProduct");
			return mav;
		}
		@RequestMapping("listProductByCategory")
		public ModelAndView listProductByCategory(Category category) {
			ModelAndView mav = new ModelAndView();
			Category c = categoryService.listCategory(category.getId());
			List<Product> ps = c.getProducts();
			mav.addObject("ps", ps);
			mav.setViewName("listProductByCategory");
			return mav;
		}
		
}
