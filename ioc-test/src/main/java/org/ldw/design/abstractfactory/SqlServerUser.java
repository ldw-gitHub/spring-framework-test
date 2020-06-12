package org.ldw.design.abstractfactory;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 10:44
 */
public class SqlServerUser implements BaseSql<User> {
	@Override
	public void insert(User user) throws Exception {
		System.out.println("sqlServer 插入一条记录");
	}

	@Override
	public User selectByPrimaryKey(Object key) throws Exception {
		System.out.println("sqlServer 获取一条user");
		return null;
	}
}
