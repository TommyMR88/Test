package com.tommny.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_bill")
public class ListBillEntity {
	private Integer idBill;
	private ListProductEntity idProduct;
	private CustomerEntity idCust;
	private String hargaAwal;
	private String diskon;
	private Integer totalHarga;
	
	public ListBillEntity(){
		
	}

	@Id
	@Column(name = "id_bill")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdBill() {
		return idBill;
	}

	public void setIdBill(Integer idBill) {
		this.idBill = idBill;
	}

	@Column(name = "id_product")
	public ListProductEntity getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(ListProductEntity idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "id_cust")
	public CustomerEntity getIdCust() {
		return idCust;
	}

	public void setIdCust(CustomerEntity idCust) {
		this.idCust = idCust;
	}

	@Column(name = "harga_awal")
	public String getHargaAwal() {
		return hargaAwal;
	}

	public void setHargaAwal(String hargaAwal) {
		this.hargaAwal = hargaAwal;
	}

	@Column(name = "diskon")
	public String getDiskon() {
		return diskon;
	}

	public void setDiskon(String diskon) {
		this.diskon = diskon;
	}

	@Column(name = "total_harga")
	public Integer getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(Integer totalHarga) {
		this.totalHarga = totalHarga;
	}
	
	

}
