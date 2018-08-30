package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.bean.ProductBean;

public interface IManagingInventoryService {
	List<ProductBean> displayListOfProducts();
	ProductBean addNewProduct(ProductBean product);
	ProductBean editExistingProductDetails(ProductBean product);
	String removeExistingProduct(String productId);
	//List<ProductBean> displayListOfCategories();
	ProductBean dispCatecory();
}
