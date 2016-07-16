package com.he.ws.jaxws.demo;

import javax.jws.WebService;

@WebService(endpointInterface="com.he.ws.jaxws.demo.SimpleService")
public class SimpleServiceImpl implements SimpleService {

	public int sum(int ...a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}
