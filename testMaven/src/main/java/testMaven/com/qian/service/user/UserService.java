package testMaven.com.qian.service.user;

import testMaven.com.qian.bean.user;

public interface UserService {
	int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}
