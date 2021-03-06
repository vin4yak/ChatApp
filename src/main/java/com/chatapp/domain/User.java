package com.chatapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection="User")
public class User {
	
	@Id
	String mobileNo;
	String password;
	String name;
	String status;
	
}
