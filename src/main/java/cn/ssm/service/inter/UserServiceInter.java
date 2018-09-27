package cn.ssm.service.inter;

import java.util.List;

import cn.ssm.dao.entity.UserEntity;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface UserServiceInter {
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
	public int  updUserById(UserEntity User);
}
