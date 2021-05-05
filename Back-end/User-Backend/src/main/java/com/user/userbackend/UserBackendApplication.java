package com.user.userbackend;

import com.user.userbackend.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.user.userbackend.model.Users;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserBackendApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new Users("Abhinav","Gautam","abhinavgautam25@gmail.com"));
        userRepository.save(new Users("Akask","Raj","xyz25@gmail.com"));
        userRepository.save(new Users("Mohan","Kumar","gautam25@gmail.com"));
        userRepository.save(new Users("Manish","Singh","soham@gmail.com"));
        userRepository.save(new Users("Neeraj","Tk","amanish@gmail.com"));
        userRepository.save(new Users("Vimal","Dubey","abhishekkumar25@gmail.com"));

    }
}
