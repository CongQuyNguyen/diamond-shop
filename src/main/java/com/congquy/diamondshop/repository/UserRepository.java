package com.congquy.diamondshop.repository;

import com.congquy.diamondshop.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findOneByUserNameAndStatus(String name, int status);

    UserEntity findOneByEmail(String email);
}
