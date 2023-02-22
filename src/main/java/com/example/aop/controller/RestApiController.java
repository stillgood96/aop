package com.example.aop.controller;

import com.example.aop.dto.User;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {



  @GetMapping(value = "/get/{id}")
  public String get(@PathVariable Long id, @RequestParam String name) {

    return id + " " + name;
  }

  @PostMapping(value="/post")
  public User post (@ModelAttribute User user) {

    return user;
  }





}
