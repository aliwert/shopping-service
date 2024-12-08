package com.shop.shopping.service;

import com.shop.shopping.model.Product;
import com.shop.shopping.request.AddProductRequest;
import com.shop.shopping.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest request, Long productId);

    List<Product> getAllProducts();

    List<Product> getAllProductsByCategory(String category);

    List<Product> getAllProductsByBrand(String brand);

    List<Product> getAllProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String productName);

    List<Product> getProductsByBrandAndName(String brand, String productName);

    Long countProductsByBrandAndName(String brand, String productName);


}
