package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.mapper.CategoryMapper;
import com.ssm.mapper.ProductMapper;
import com.ssm.pojo.Category;
import com.ssm.pojo.Page;
import com.ssm.pojo.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMapper {
			@Autowired
			private CategoryMapper categoryMapper;
			@Autowired
			private ProductMapper productMapper;
			public CategoryMapper getCategoryMapper() {
				return categoryMapper;
			}

			public void setCategoryMapper(CategoryMapper categoryMapper) {
				this.categoryMapper = categoryMapper;
			}
			@Test
			public void testAdd() {
				Category c = categoryMapper.listCategory(1);
				System.out.println(c);
			}
}
