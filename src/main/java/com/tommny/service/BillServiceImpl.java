package com.tommny.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tommny.dao.BillDao;
import com.tommny.model.ListBillEntity;
import com.tommny.model.ListProductEntity;

@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillDao billDao;

	@Transactional
	@Override
	public void addListBill(ListBillEntity listBill) {
		billDao.addListBill(listBill);
	}

	@Transactional
	@Override
	public ListProductEntity listProdById(Integer id) {
		return billDao.listProdById(id);
	}

	

}
