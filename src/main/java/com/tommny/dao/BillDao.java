package com.tommny.dao;

import java.util.List;

import com.tommny.model.ListBillEntity;
import com.tommny.model.ListProductEntity;

public interface BillDao {
	
	public ListBillEntity addListBill(ListBillEntity listBill) ;
	
	public ListProductEntity listProdById (Integer id);

}
