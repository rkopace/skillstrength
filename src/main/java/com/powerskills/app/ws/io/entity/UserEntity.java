package com.powerskills.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -3533489009418102314L;

	@Id
	@GeneratedValue
	@Getter
	@Setter
	private long id;
	
	@Column(nullable = false)
	@Getter
	@Setter
	private String userId; // public user id
	@Column(nullable = false, length = 50)
//	@Column(nullable = false, length = 50, unique=true)
	@Getter
	@Setter
	private String firstName;
	@Column(nullable = false, length = 50)
	@Getter
	@Setter
	private String lastName;
	@Column(nullable = false, length = 3)
	@Getter
	@Setter
	private Integer age;
	@Column(nullable = false, length = 200)
	@Getter
	@Setter
	private String address;
	@Column(nullable = false, length = 20)
	@Getter
	@Setter
	private String phoneNumber;
	@Column(nullable = false, length = 120)
	@Getter
	@Setter
	private String email;
	@Column(nullable = false)
	@Getter
	@Setter
	private String encryptedPasword;
	@Getter
	@Setter
	private String emailVerificationToken;
	@Column(nullable = false)
	@Getter
	@Setter
    private String password;
	@Column(nullable = false)
	@Getter
	@Setter
	private Boolean emailVerificationStatus = false;

}
