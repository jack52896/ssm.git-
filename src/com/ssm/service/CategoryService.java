package com.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
@Service
public interface CategoryService {
			public List<Category> list(Page page);
			
			public int total();
			
			public void delete(Category category);
			
			public Category get(Category category);
			
			public void update(Category category);
			
			public Category listCategory(int cid);
}
