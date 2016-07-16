package com.he.ws.jaxrs.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.he.model.User;

@Path("/")
public class UserServiceImpl implements UserService{
	
	private static Map<Long,User> userMap = new ConcurrentHashMap<Long, User>();
	static{
		User u1 = new User();
		u1.setId(1L);
		u1.setName("明月");
		u1.setBirthDay(new Date());
		User u2 = new User();
		u2.setId(2L);
		u2.setName("小宋");
		u2.setBirthDay(new Date());
		userMap.put(u1.getId(), u1);
		userMap.put(u2.getId(), u2);
	}
	/**
	 * 查询User
	 * @param id
	 * @return
	 */
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User findUserById(@PathParam("id")Long id){
		return userMap.get(id);
	}
	
	/**
	 * 查询所有User
	 * @return
	 */
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> findUsers(){
		Collection<User> users = userMap.values();
		Iterator<User> iterator = users.iterator();
		List<User> list = new ArrayList<User>();
		while(iterator.hasNext()){
			list.add(iterator.next());
		}
		return list;
	}
}
