package com.backtash.bestStore.controller;


import com.backtash.bestStore.models.Product;
import com.backtash.bestStore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<Product> products = repository.findAll();
        model.addAttribute("products",products);
        return "products/index";
    }

}
