package org.ldw.design.iterator;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/12 9:53
 */
public abstract class Iterator {

	//iterator迭代器抽象类
	public abstract Object first();
	public abstract Object next();
	public abstract Boolean isDone();
	public abstract Object currentItem();

}
