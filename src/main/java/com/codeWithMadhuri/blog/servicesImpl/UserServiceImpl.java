package com.codeWithMadhuri.blog.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeWithMadhuri.blog.entities.User;
import com.codeWithMadhuri.blog.payloads.UserDto;
import com.codeWithMadhuri.blog.repositories.UserRepository;
import com.codeWithMadhuri.blog.services.UserService;

public class UserServiceImpl  implements UserService {
	
	@Autowired
private UserRepository userRepository;
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User user=this.dtoToUser(userDto);
		
		User savedUser = this.userRepository.save(user);
		
		
		
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}
	
	
	//
	public User dtoToUser(UserDto userDto) {
		User user =new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		return user;
		
		
	}
	
	public UserDto userToDto(User user) {
		
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getPassword());
		
		return userDto;
		
		
	}
	
	
	

}
