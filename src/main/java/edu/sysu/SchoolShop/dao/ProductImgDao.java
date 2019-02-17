package edu.sysu.SchoolShop.dao;

import java.util.List;

import edu.sysu.SchoolShop.entity.ProductImg;

public interface ProductImgDao {

	List<ProductImg> queryProductImgList(long productId);

	int batchInsertProductImg(List<ProductImg> productImgList);

	int deleteProductImgByProductId(long productId);
}
