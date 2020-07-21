package com.mytestcrud.springbootcrudexample.repository;

import com.mytestcrud.springbootcrudexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer>{
    Product findByName(String name);
}
