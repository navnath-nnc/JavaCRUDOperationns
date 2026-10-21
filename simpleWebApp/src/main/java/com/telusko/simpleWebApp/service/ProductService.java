package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Getter
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//   List<Product> products =new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Canon Camera", 70000)));
public List<Product> getProducts(){
    return repo.findAll();
}

public Product getProductById(int prodId){
    return repo.findById(prodId).orElse(new Product(100, "No item", 0));
}

public void addProduct(Product prod){
repo.save(prod);
}

public void updateProduct(Product prod){
   repo.save(prod);
}

public void deleteProduct(int prodId){
   repo.deleteById(prodId);
}
}
