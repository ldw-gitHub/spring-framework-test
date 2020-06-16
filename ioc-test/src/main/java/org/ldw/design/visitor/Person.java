package org.ldw.design.visitor;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 10:10
 */
public abstract class Person {

	//接受
	public abstract void accept(Action visitor);
}
