package com.tommny.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.tommny.model.ListBillEntity;
import com.tommny.model.ListProductEntity;
import com.tommny.service.BillService;
import com.tommny.service.ProductService;
import com.tommny.util.CustomErrorType;
 
@RestController
@RequestMapping("/api")
public class RestApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
 
    @Autowired
    ProductService productService;
    
    @Autowired
    BillService billService;
 
    @RequestMapping(value = "/getAllProduct/", method = RequestMethod.GET,headers = "Accept=application/json")
    public String getAllProduct() {
    	List<ListProductEntity> prodList = productService.getAllProduct();
    	return new String("Product List");
    }
 
    @RequestMapping(value = "/billProduct/{id}", method = RequestMethod.GET)
    public String addBill(@PathVariable int id) {
    	ListBillEntity listBill = new ListBillEntity();
    	ListProductEntity listProd = billService.listProdById(id);
    	
    	// lakukan validasi diskon berdarka customer type 
    	
    	
    	
    	return new String("Success");
    }
 
}