package com.gokdemir.dto;

import com.gokdemir.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDto {

	private String username;
	
	private String password;
	
	public User toEntity(CreateUserDto createUserDto) {
		return User.builder()
				.username(createUserDto.getUsername())
				.password(createUserDto.getPassword())
				.build();
	}
}
