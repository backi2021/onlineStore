package com.backtash.bestStore.repository;

import com.backtash.bestStore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer>{


}
