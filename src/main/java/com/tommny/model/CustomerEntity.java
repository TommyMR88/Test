package com.tommny.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MS_CUSTOMER")
public class CustomerEntity {
	
	private Integer idCust;
	private CustomerTypeEntity custType;
	private String namaCust;
	private Integer periodCust;
	
	public CustomerEntity(){
		
	}

	@Id
	@Column(name = "id_cust")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdCust() {
		return idCust;
	}

	public void setIdCust(Integer idCust) {
		this.idCust = idCust;
	}

	@Column(name = "cust_type")
	public CustomerTypeEntity getCustType() {
		return custType;
	}

	public void setCustType(CustomerTypeEntity custType) {
		this.custType = custType;
	}

	@Column(name = "nama_cust")
	public String getNamaCust() {
		return namaCust;
	}

	public void setNamaCust(String namaCust) {
		this.namaCust = namaCust;
	}

	@Column(name = "period_cust")
	public Integer getPeriodCust() {
		return periodCust;
	}

	public void setPeriodCust(Integer periodCust) {
		this.periodCust = periodCust;
	}
	
	

}
