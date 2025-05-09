
package com.java.pharmaceutique.Controller;

import com.java.pharmaceutique.Entity.Product;
import com.java.pharmaceutique.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class PoductController {

@Autowired
    private ProductService productService;

@GetMapping("/all")
    public List<Product> getAll(){return productService.getAllProducts();}

@GetMapping("/getOneProduct/{id}")
        public Product getOneProduct(@PathVariable Long id){
    return productService.getOneProduct(id);
}
@PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
  return   productService.addProduct(product);
}
@DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable ("id")Long id){
    productService.deleteProduct(id);
}
@PostMapping("/update/{id}")
    public Product updateProduct(@PathVariable("id") Long id, Product product){
    product.setId(id);
    return productService.addProduct(product);
}
}
