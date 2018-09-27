package cn.ssm.dao.entity;
/**
 * 该类为实体类，与user表对应 类---表 对象---记录 成员变量---字段
 * 
 * ORM：对象关系型数据映射 mybatis hibernate
 *
 */
public class UserEntity {
	public int id;
	public String name;
	public int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserEntity(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public UserEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
