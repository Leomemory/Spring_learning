package com.imooc.demo3;

import javax.annotation.Resource;

public class ProductService {
    @Resource(name = "CategoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "ProductDao")
    private ProductDao productDao;

//    public CategoryDao getCategoryDao() {
//        return categoryDao;
//    }
//
//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public ProductDao getProductDao() {
//        return productDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }

    public void save(){
        System.out.println("ProductService的save方法执行了...");
        categoryDao.save();
        productDao.save();
    }
}
