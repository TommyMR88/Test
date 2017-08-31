package com.tommny.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tommny.model.ListProductEntity;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ListProductEntity> getAllProduct() {
		
		return (List<ListProductEntity>) sessionFactory.getCurrentSession().createQuery("from ListProduct").list();
	}

}
