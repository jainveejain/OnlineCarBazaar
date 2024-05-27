package com.app.pojo;

import com.app.entities.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LoginResponse {

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private String message;
	private String token;
	private User user;
}
