package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

import com.bilgeadam.lesson033.utility.User;

public interface IEmail {

	void sendEmail(User user);

}