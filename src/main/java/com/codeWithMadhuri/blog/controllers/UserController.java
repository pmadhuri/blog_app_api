package com.codeWithMadhuri.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWithMadhuri.blog.payloads.UserDto;
import com.codeWithMadhuri.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
@Autowired
private UserService userService;
@PostMapping("/")
public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
	
	UserDto createUserDto=this.userService.createUser(userDto);
	
	return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	
	
}
}
