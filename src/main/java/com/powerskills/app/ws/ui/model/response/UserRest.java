package com.powerskills.app.ws.ui.model.response;

import lombok.Getter;
import lombok.Setter;

public class UserRest {
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
	private String phoneNumber;
	@Getter
	@Setter
	private String email;
}
