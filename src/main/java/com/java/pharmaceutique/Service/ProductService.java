package com.java.pharmaceutique.Service;

import com.java.pharmaceutique.Entity.Product;
import com.java.pharmaceutique.Repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Productrepo productrepo;
    public List<Product> getAllProducts() {
        return productrepo.findAll();
    }

    public Product getProductById(long id) {
        return productrepo.findById(id).orElseThrow();
    }
public Product addProduct(Product product) {
        return productrepo.save(product);
}
public void deleteProduct(long id) {
        productrepo.deleteById(id);

}

public Product updateProduct(Product product) {
         return productrepo.save(product);
}
}
