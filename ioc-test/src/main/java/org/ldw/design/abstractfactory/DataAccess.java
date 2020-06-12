package org.ldw.design.abstractfactory;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 10:35
 */
public class DataAccess {

	private static final String assemblyName = "抽象工厂模式";
	//db可以从配置文件中获取
	private static final String db = "org.ldw.design.abstractfactory.SqlServer";

	public static SqlServerUser createBaseSql() throws Exception {
		Class<?> user = Class.forName(db + "User");
		return (SqlServerUser) user.newInstance();
	}


}
