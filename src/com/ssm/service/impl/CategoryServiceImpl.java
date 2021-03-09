package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.CategoryMapper;
import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
			@Autowired
			CategoryMapper categoryMapper;
			

			public List<Category> list(Page page){
					return categoryMapper.list(page);
			}


			@Override
			public int total() {
				return categoryMapper.total();
			}


			@Override
			public void delete(Category category) {
				categoryMapper.delete(category);
				
			}


			@Override
			public Category get(Category category) {
				return categoryMapper.get(category);
			}


			@Override
			public void update(Category category) {
				categoryMapper.update(category);
			}


			@Override
			public Category listCategory(int cid) {
				return categoryMapper.listCategory(cid);
			}
			
}
