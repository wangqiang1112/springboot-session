package htjs.service.impl;

import htjs.entity.User;
import htjs.mapper.UserMapper;
import htjs.service.UserIService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@ComponentScan({"htjs.mapper"})
@Service("userService")
public class UserService implements UserIService{

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> query(Map mapParam) {
		return userMapper.query(mapParam);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public User find(int id) {
		return userMapper.find(id);
	}
	
	public void delete(int id){
		userMapper.delete(id);
	}

}
