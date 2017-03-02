package com.example.course;

import com.example.data.bean.User;

public class Profile {

	private User user;
	
	public Profile() {}
	

	public Profile(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
