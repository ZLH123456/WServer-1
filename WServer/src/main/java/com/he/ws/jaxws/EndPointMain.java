package com.he.ws.jaxws;

import javax.xml.ws.Endpoint;

import com.he.ws.jaxws.user.UserServiceImpl;

public class EndPointMain {
	public static void main(String[] args) {
		String address = "http://localhost:8081/user";
		Endpoint.publish(address, new UserServiceImpl());
	}
}
