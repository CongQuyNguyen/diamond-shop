package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.ColorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ColorsRepository extends JpaRepository<ColorsEntity, Long> {

    // Lấy ra n colors vừa mới thêm vào
    @Query(value = "SELECT * FROM (" +
            " SELECT * FROM colors ORDER BY id DESC LIMIT :count" +
            " ) AS colors_temp ORDER BY id ASC", nativeQuery = true)
    List<Object[]> getColorsStillInsert(@Param("count") int count);
}
