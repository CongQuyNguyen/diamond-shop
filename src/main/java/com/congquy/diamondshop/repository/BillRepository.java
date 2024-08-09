package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillRepository extends JpaRepository<BillEntity, Long> {
    // Lấy ra bill vừa được thêm vào để truy vết các bill detail
    @Query( value = "SELECT MAX(id) FROM bill", nativeQuery = true)
    Object[] getLastBill();
}
