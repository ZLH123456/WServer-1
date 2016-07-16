package com.he.ws.jaxws.demo;

import javax.jws.WebService;

@WebService
public interface SimpleService {
	int sum(int ...a);
}
