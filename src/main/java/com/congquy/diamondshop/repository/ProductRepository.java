package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    // Sử dụng native query
    @Query( value = "SELECT p.id AS id_product, p.category_id, p.size, p.quantity, " +
            "p.sale, p.price, p.new_product, p.name, p.highlight, p.description, p.content, " +
            "c.id AS id_color, c.name AS name_color, c.code AS code_color, c.image " +
            "FROM product AS p " +
            "INNER JOIN colors AS c " +
            "ON p.id = c.id GROUP BY p.id, c.id " +
            "ORDER BY RAND()", nativeQuery = true)
    List<Object[]> getAllProduct();

//    @Query(value = "select id, category_id, size, quantity, sale, price, new_product, name, highlight, description from product", nativeQuery = true)
//    List<Object[]> getAllProduct();
}
