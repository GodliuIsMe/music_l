package com.example.musicl;

import com.example.musicl.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void findByUsername() {
//        User user = new User();
//        user.setUsername("liu");
//        user.setNickname("ljx");
//        user.setEnabled(true);
//        user.setLocked(false);
//        user.setPassword("9095155");
//        user.setGender(Gender.MALE);
//        User saveUser = userRepository.save(user);
//        System.out.println(saveUser);
//
//        User result = userRepository.findByUsername("liu");
//        System.out.println(result);
    }
}