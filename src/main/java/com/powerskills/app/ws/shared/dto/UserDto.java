package com.powerskills.app.ws.shared.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class UserDto implements Serializable{

	private static final long serialVersionUID = -5691878745714180932L;
	@Getter
	@Setter
	private long id;
	@Getter
	@Setter
    private String userId;
	@Getter
	@Setter
    private String firstName;
	@Getter
	@Setter
    private String lastName;
	@Getter
	@Setter
	private Integer age;
	@Getter
	@Setter
	private String address;
	@Getter
	@Setter
    private String email;
	@Getter
	@Setter
	private String phoneNumber;
	@Getter
	@Setter
    private String password;    //unencrypted
	@Getter
	@Setter
    private String encryptedPassword;
	@Getter
	@Setter
    private String emailVerificationToken;
	@Getter
	@Setter
    private Boolean emailVerificationStatus = false;
}
