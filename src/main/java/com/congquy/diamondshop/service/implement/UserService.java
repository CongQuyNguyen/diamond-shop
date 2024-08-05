package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.entity.RoleEntity;
import com.congquy.diamondshop.entity.UserEntity;
import com.congquy.diamondshop.repository.RoleRepository;
import com.congquy.diamondshop.repository.UserRepository;
import com.congquy.diamondshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Random;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;



    // Hàm tự đề cập user name cho người dùng
    private String recommendUserName(String fullName) {
        String[] nameParts = fullName.trim().toLowerCase().split("\\s+");

        String lastName = nameParts[nameParts.length - 1];
        String firstInitial = nameParts[0].substring(0, 1);

        String baseUsername = firstInitial + lastName;
        Random random = new Random();
        int randomNumber = random.nextInt(1000);

        return baseUsername + randomNumber;
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public void addUser(String email, String fullName, String password, String address) {
        // Kiểm tra nếu email đã tồn tại
        if (userRepository.findOneByEmail(email) != null) {
            throw new RuntimeException("Email đã tồn tại!");
        }

        // Mã hóa mật khẩu
        String encodedPassword = passwordEncoder.encode(password);

        // Tạo đối tượng UserEntity và lưu vào CSDL
        UserEntity newUser = new UserEntity();
        newUser.setEmail(email);
        newUser.setFullName(fullName);
        newUser.setPassword(encodedPassword);
        newUser.setAddress(address);
        newUser.setUserName(recommendUserName(fullName));
        newUser.setStatus(1);

        // Gán quyền USER cho người dùng mới
        RoleEntity userRole = roleRepository.findByCode("USER");
        newUser.setRoles(Collections.singletonList(userRole));
        userRepository.save(newUser);
    }
}