package com.tommny.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MS_CUSTOMER_TYPE")
public class CustomerTypeEntity {
	
	private String custTypeId;
	private String custTypeName;
	
	public CustomerTypeEntity(){
		
	}

	@Id
	@Column(name = "cust_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getCustTypeId() {
		return custTypeId;
	}

	public void setCustTypeId(String custTypeId) {
		this.custTypeId = custTypeId;
	}

	@Column(name = "cust_type_name")
	public String getCustTypeName() {
		return custTypeName;
	}

	public void setCustTypeName(String custTypeName) {
		this.custTypeName = custTypeName;
	}
	
	

}
