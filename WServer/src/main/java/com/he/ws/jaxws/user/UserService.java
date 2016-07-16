package com.he.ws.jaxws.user;

import java.util.List;

import javax.jws.WebService;

import com.he.model.User;

@WebService
public interface UserService {

	public List<User> findUsers(User user);
	
	public User findUserByPrimaryKey(Long id);
}
