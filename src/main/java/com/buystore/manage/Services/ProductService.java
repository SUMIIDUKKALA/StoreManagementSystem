package com.buystore.manage.Services;

import com.buystore.manage.Model.Product;
import com.buystore.manage.Repository.ProductRepository;
import com.buystore.manage.exeption.ProductNotfoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository prepo;


    public List<Product> getAllProducts()
    {
        return prepo.findAll();
    }
    public void save(Product pdct){ prepo.save(pdct); }

   public List getproductById(int id) {
       if(!prepo.findAll().contains(id)){
           throw new ProductNotfoundException();

       }
       else
       {
           List<String> prlist=new ArrayList<String>();
       Product tempProduct = prepo.getOne(id);
       prlist.add(tempProduct.getPdctName());
       prlist.add(tempProduct.getCategory());
       prlist.add(tempProduct.getManufacturer());
       prlist.add(tempProduct.getStock());
       prlist.add(tempProduct.getExpirydate());
       return prlist;
   }


   }
}
