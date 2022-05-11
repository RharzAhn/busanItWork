package com.pgm.android_server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgm.android_server.model.User;
import com.pgm.android_server.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor

public class RestApiController {
	@Autowired
	   private UserRepository userRepository;
	   
	   @GetMapping("getUser/{id}")
	   public User getUser(@PathVariable("id") Long id) {
	      return userRepository.findById(id).get();
	   }
	   
	   @PostMapping("insert")
	   public String insertUser(@RequestBody User user) {
	      userRepository.save(user);
	      return "datasave";
	   }
	   @GetMapping("List")
	   public Map<String,List<User>> getList(){
	      Map<String,List<User>> map=new HashMap<String,List<User>>();
	      map.put("users", userRepository.findAll());
	      return map;
	   }

	}
