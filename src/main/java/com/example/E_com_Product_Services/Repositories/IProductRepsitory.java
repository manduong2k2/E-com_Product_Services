package com.example.E_com_Product_Services.Repositories;

import com.example.E_com_Product_Services.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepsitory extends JpaRepository<Product,Long> {

}
