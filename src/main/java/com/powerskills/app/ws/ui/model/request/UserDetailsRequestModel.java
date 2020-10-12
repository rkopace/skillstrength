package com.powerskills.app.ws.ui.model.request;

import lombok.Getter;
import lombok.Setter;

public class UserDetailsRequestModel {
	
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
	private String phoneNumber;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String password;
	
}
