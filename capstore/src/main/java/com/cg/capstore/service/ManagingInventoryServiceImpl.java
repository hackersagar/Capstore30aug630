package com.cg.capstore.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.bean.DiscountBean;
import com.cg.capstore.bean.ProductBean;
import com.cg.capstore.repo.IProductInventoryRepo;
@Service
public class ManagingInventoryServiceImpl implements IManagingInventoryService{
	@Autowired
	IProductInventoryRepo productInventoryRepo;
	@Override
	public List<ProductBean> displayListOfProducts() {
		
		return productInventoryRepo.findAll();
	}
	@Override
	public ProductBean addNewProduct(ProductBean product) {
		
		
		
		return productInventoryRepo.save(product);
	}
	@Override
	public ProductBean editExistingProductDetails(ProductBean product) {
		
		ProductBean product1= productInventoryRepo.getOne(product.getProductId());
		product1.setProductName(product.getProductName());
		product1.setCategory(product.getCategory());
		product1.setDiscount(product.getDiscount());
		product1.setProductId(product.getProductId());
		product1.setPrice(product.getPrice());
		product1.setQuantity(product.getQuantity());
		product1.setImageId(product.getImageId());
		return productInventoryRepo.save(product1);
	}
	@Override
	public String removeExistingProduct(String productId) {
		System.err.println(productInventoryRepo.getOne(productId));
		productInventoryRepo.deleteById(productId);
		
		return productId;
		
	}
	/*@Override
	public List<ProductBean> displayListOfCategories() {
		List<ProductBean> list=productInventoryRepo.selectCategory();
		
		return  list;
	}*/
	@Override
	public ProductBean dispCatecory() {
		
		return productInventoryRepo.dispCategory();
	}

}
