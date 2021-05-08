package com.buystore.manage.controller;

import com.buystore.manage.Model.Product;
import com.buystore.manage.Repository.ProductRepository;
import com.buystore.manage.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/product")
public class ProductController {

    @Autowired
    private ProductService pdctservice;
    @Autowired
    private ProductRepository prepo;

    @RequestMapping(method = RequestMethod.GET,value = "/addproduct")
    public String addProducts()
    {
        Product a=new Product(3,"Bread","Bakery","jjbakers","300","12/05/2021");
        pdctservice.save(a);

        return "success";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/viewproducts")
    public List<Product> viewProducts()
    {


        return  pdctservice.getAllProducts();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/viewProductById/{id}")
    public List viewProductById(@PathVariable int id)
    {

       return pdctservice.getproductById(id);
    }
}
