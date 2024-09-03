package com.yamtes.rest.webservices.restful.webservices.controller;

import com.yamtes.rest.webservices.restful.webservices.jpa.UserRespository;
import com.yamtes.rest.webservices.restful.webservices.user.User;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.HttpResource;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class UserResource {
    @Resource
    private UserRespository userRespository;

    @GetMapping("/users")
    public List<User> findAll() {
        return userRespository.findAll();
    }

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable int id) {
        Optional<User> optionalUser = userRespository.findById(id);
        return optionalUser.orElse(null);
    }
@PostMapping("/users")
    public void createUser(@Valid @RequestBody User user) {
        userRespository.save(user);

    }
}
