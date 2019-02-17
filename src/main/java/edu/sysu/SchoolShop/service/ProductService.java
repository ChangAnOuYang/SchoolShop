package edu.sysu.SchoolShop.service;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import edu.sysu.SchoolShop.dto.ProductExecution;
import edu.sysu.SchoolShop.entity.Product;

public interface ProductService {
	ProductExecution getProductList(Product productCondition, int pageIndex, int pageSize);

	Product getProductById(long productId);

	ProductExecution addProduct(Product product, CommonsMultipartFile thumbnail, List<CommonsMultipartFile> productImgs)
			throws RuntimeException;

	ProductExecution modifyProduct(Product product, CommonsMultipartFile thumbnail,
			List<CommonsMultipartFile> productImgs) throws RuntimeException;
}
