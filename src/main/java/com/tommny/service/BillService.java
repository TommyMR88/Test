package com.tommny.service;

import java.util.List;

import com.tommny.model.ListBillEntity;
import com.tommny.model.ListProductEntity;

public interface BillService {
	
	public void addListBill(ListBillEntity listBill) ;
	
	public ListProductEntity listProdById (Integer id);

}
