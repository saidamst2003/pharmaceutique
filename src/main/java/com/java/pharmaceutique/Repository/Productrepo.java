package com.java.pharmaceutique.Repository;

import com.java.pharmaceutique.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository <Product, Long> {

}
