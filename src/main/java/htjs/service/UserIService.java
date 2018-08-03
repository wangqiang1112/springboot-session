package htjs.service;

import htjs.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public interface UserIService {

	public List<User> query(Map mapParam);
	public void insert(User user);
}
