package org.ldw.design.iterator;

/**
 * @description  聚集抽象类
 * @author: liudawei
 * @date: 2020/6/12 9:55
 */
public abstract class Aggregate {
	//创建迭代器
	public abstract Iterator createIterator();
}
