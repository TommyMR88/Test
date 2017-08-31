package com.tommny.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_product")
public class ListProductEntity {
	
	private Integer idProduct;
	private String nama;
	private String harga;
	
	public ListProductEntity(){
		
	}

	@Id
	@Column(name = "id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "nama")
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "harga")
	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}
	
	

}
