package com.he.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
	private Long id;
	private String name;
	private String password;
	private Date birthDay;
	private Integer age;
}
