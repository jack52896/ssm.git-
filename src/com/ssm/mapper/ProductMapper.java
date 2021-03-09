package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.pojo.Product;

public interface ProductMapper {
		public List<Product> listProduct(Page page);
		
		public int total();
		
		public Category listProductByCategory(int cid);
}
