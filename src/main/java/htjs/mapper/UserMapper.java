package htjs.mapper;

import htjs.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

	public void insert(User user);

	public void update(User user);
	
	public void delete(int id);
	
	public User find(int id);

	public List<User> query(Map mapParam);
}
