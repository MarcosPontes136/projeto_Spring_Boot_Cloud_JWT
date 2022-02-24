package com.avanade.dio.springbootjwt.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class UserData implements Serializable {

	private String userName;
	private String password;
	
}
