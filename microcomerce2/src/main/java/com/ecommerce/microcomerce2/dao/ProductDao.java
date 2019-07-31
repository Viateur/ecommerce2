package com.ecommerce.microcomerce2.dao;
import com.ecommerce.microcomerce2.model.Product;
import java.util.List;

public interface ProductDao {
    public List<Product>findAll();
    public Product findById(int id);
    public Product save(Product product);
}