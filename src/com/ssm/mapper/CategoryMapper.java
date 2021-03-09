package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;

public interface CategoryMapper {
		public List<Category> list(Page page);
		
		public void add(Category category);
		
		public int total();
		
		public void delete(Category category);
		
		public Category get(Category category);
		
		public void update(Category category);
		
		public Category listCategory(int cid);
}
