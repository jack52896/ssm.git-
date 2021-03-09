package com.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.pojo.Product;
@Service
public interface ProductService {
		public List<Product> listProduct(Page page);
		
		public int total();
	}
