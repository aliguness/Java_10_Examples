package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

import com.bilgeadam.lesson033.utility.User;

public class Test {
	public static void main(String[] args) {
		User user = new User("Mustafa", "mustfa@gmail.com");
		Facebook facebook = new Facebook();
		facebook.sendEmail(user);

	}

}