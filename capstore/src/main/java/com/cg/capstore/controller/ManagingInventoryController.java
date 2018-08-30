package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstore.bean.ProductBean;
import com.cg.capstore.service.IManagingInventoryService;




@RestController
public class ManagingInventoryController {
	
	@Autowired
	IManagingInventoryService managingInventoryService;
	
	@RequestMapping("/Hi")
	public String displayHello() {
		return "Hello from spring";
	}
	
	
	@RequestMapping(value = "/displayAllProducts",method=RequestMethod.POST)
	List<ProductBean> displayAllProducts() {
		
		return managingInventoryService.displayListOfProducts();
		
	}
	
	@RequestMapping(value = "/addNewProduct", method = RequestMethod.POST)
	ProductBean addNewProduct( ProductBean product) {
		return managingInventoryService.addNewProduct(product);
	}
	
	@RequestMapping(value = "/editExistingProductDetails",method=RequestMethod.PUT)
	public ProductBean editExistingProductDetails(@RequestBody ProductBean product) {
		
		return managingInventoryService.editExistingProductDetails(product);
	}
	
	@RequestMapping(value = "/removeExistingProduct",method=RequestMethod.DELETE)
	public String removeExistingProduct(String productId) {
		System.err.println(productId);
		return managingInventoryService.removeExistingProduct(productId);
}
	/*@RequestMapping(value = "/displaycategories",method=RequestMethod.POST)
	ProductBean displayCategories() {
		
		return managingInventoryService.dispCatecory();
		
	}*/
	
}