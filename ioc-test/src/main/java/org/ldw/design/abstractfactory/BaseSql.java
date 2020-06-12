package org.ldw.design.abstractfactory;

import org.ldw.model.User;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 10:41
 */
public interface BaseSql<T> {
	void insert(T t) throws Exception;

	public T selectByPrimaryKey(Object key) throws Exception;

}
