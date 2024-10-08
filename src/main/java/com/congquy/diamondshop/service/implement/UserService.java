package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.entity.RoleEntity;
import com.congquy.diamondshop.entity.UserEntity;
import com.congquy.diamondshop.repository.RoleRepository;
import com.congquy.diamondshop.repository.UserRepository;
import com.congquy.diamondshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JavaMailSender mailSender;

    // Kiểm tra email và code của email đó có hợp lệ hay không
    private Map<String, String> verificationCodes = new HashMap<>();



    // Hàm tự đề cập user name cho người dùng
    private String removeAccents(String str) {
        String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{M}");
        return pattern.matcher(normalized).replaceAll("");
    }

    private String recommendUserName(String fullName) {
        String nameWithoutAccents = removeAccents(fullName.trim().toLowerCase());
        String[] nameParts = nameWithoutAccents.split("\\s+");

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

    public boolean verifyUser(String email, String code) {
        // Lấy code đã lưu
        String storedCode = verificationCodes.get(email);

        if (storedCode != null && storedCode.equals(code)) {
            return true;
        }
        return false;
    }

    public String generateAndSendVerificationCode(String email) {
        if (userRepository.findOneByEmail(email) != null) {
            throw new RuntimeException("Email đã tồn tại!");
        }

        String code = String.format("%06d", new Random().nextInt(999999));

        verificationCodes.put(email, code);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Account Registration Verification Code");
        message.setText("Dear User,\n\n" +
                "Thank you for registering with our service. To complete your registration, please use the verification code provided below:\n\n" +
                "Verification Code: " + code + "\n\n" +
                "If you did not request this code, please ignore this email.\n\n" +
                "Best regards,\n" +
                "The Diamond Shop");

        mailSender.send(message);

        return code;
    }
}
