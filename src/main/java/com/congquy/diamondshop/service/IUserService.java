package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.UserDTO;
import com.congquy.diamondshop.entity.UserEntity;

public interface IUserService {
    UserEntity getUserByEmail(String email);
    void addUser(String email, String fullName, String password, String address);
}
