package com.tommny.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tommny.dao.ProductDao;
import com.tommny.model.ListProductEntity;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Transactional
	public List<ListProductEntity> getAllProduct() {
		return productDao.getAllProduct();
	}

}
