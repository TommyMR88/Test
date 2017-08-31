package com.tommny.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tommny.model.ListBillEntity;
import com.tommny.model.ListProductEntity;

@Repository
public class BillDaoImpl implements BillDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ListBillEntity addListBill(ListBillEntity listBill) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(listBill);
		return listBill;
	}

	@Override
	public ListProductEntity listProdById(Integer id) {
		return (ListProductEntity) sessionFactory.getCurrentSession().get(
				ListProductEntity.class, id);
	}

	

}
