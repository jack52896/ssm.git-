package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.CategoryMapper;
import com.ssm.mapper.ProductMapper;
import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.pojo.Product;
import com.ssm.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<Product> listProduct(Page page) {
		
		return productMapper.listProduct(page);
	}
	@Override
	public int total() {
		
		return productMapper.total();
	}
	
}
