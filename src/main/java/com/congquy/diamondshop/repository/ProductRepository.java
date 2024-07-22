package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    // Sử dụng native query
//    @Query( value = "'SELECT p.id AS id_product, p.category.id, p.size, p.sale, " +
//            "p.quantity, p.price, p.newProduct, p.name, p.highlight, p.content, p.description," +
//            "c.name AS name_color, c.code AS code_color, c.id AS id_color " +
//            "FROM product AS p " +
//            "INNER JOIN colors AS c " +
//            "ON p.id = c.id GROUP BY p.id, c.id'", nativeQuery = true)

    @Query(value = "'select * from product'", nativeQuery = true)
    List<Object[]> getAllProduct();
}
