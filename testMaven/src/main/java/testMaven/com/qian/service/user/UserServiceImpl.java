package testMaven.com.qian.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import testMaven.com.qian.bean.user;
import testMaven.com.qian.dao.userMapper;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private userMapper usertMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(user record) {
		// TODO Auto-generated method stub
		return usertMapper.insertSelective(record);
	}

	@Override
	public int insertSelective(user record) {
		// TODO Auto-generated method stub
		return usertMapper.insertSelective(record);
	}

	@Override
	public user selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return usertMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(user record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(user record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
