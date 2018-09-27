package cn.ssm.dao.mapper;

import java.util.List;
import cn.ssm.dao.entity.UserEntity;
public interface UserMapper {
	/**查询全部*/
	public List<UserEntity> selectAllUser();
	/**添加部门*/
	public int insertUserParams(UserEntity User);
	/**ID查询*/
	public UserEntity selectUserById(int id);
	/**ID删除*/
	public int delUserById(int id);
	/**名称模糊查询*/
	public List<UserEntity> selectUserByLike(String keyWord);
	/**更新部门*/
	public int  updUserById(UserEntity User);
}
