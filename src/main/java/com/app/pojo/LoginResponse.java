package com.app.pojo;

import com.app.entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginResponse {

	private String message;
	private String token;
	private User user;
}
