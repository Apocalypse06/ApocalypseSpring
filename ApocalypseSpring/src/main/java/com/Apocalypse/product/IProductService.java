package com.Apocalypse.product;

import java.util.List;

public interface IProductService {

	public int addProduct(String productName) throws Exception;

	public List<ProductBean> getProduct(String productName) throws Exception;

	public ProductBean getProductDetail(String productName) throws Exception;

	public ProductBean getProductName(String productName) throws Exception;

	public ProductBean getProductPrice(String productName) throws Exception;

	public ProductBean getProductDesc(String productName) throws Exception;

	public ProductBean getProductPicture(String picturePath) throws Exception;

	public int updateProduct(String productName, String price, String productDesc) throws Exception;
}