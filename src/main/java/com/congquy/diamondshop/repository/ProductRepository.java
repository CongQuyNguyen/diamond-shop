package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    String sql = "SELECT p.id AS id_product, p.category_id, p.size, p.quantity, " +
            "p.sale, p.price, p.new_product, p.name, p.highlight, p.description, p.content, " +
            "c.id AS id_color, c.name AS name_color, c.code AS code_color, c.image " +
            "FROM product AS p " +
            "INNER JOIN colors AS c " +
            "ON p.id = c.id ";

    // Sử dụng native query
    @Query( value = sql +
            "WHERE p.highlight = :highlight " +
            "GROUP BY p.id, c.id " +
            "ORDER BY RAND() " +
            "LIMIT 9", nativeQuery = true)
    List<Object[]> findAllByHighlight(@Param("highlight") int highlight);


    @Query( value = sql +
            "WHERE p.new_product = :newProduct " +
            "GROUP BY p.id, c.id " +
            "ORDER BY RAND() " +
            "LIMIT 12", nativeQuery = true)
    List<Object[]> findAllByNew(@Param("newProduct") int newProduct);

    @Query( value = sql +
            "WHERE p.category_id = :categoryId " +
            "GROUP BY p.id, c.id " +
            "ORDER BY RAND() ", nativeQuery = true)
    List<Object[]> findAllByCategory(@Param("categoryId") Long categoryId);

    @Query( value = sql +
            "WHERE p.category_id = :categoryId " +
            "GROUP BY p.id, c.id " +
            "LIMIT :start, :totalProductInPage", nativeQuery = true)
    List<Object[]> findAllByPagination(@Param("start") int start, @Param("totalProductInPage") int totalProductInPage, @Param("categoryId") Long categoryId);

}
