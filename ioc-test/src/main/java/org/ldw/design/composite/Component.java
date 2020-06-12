package org.ldw.design.composite;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 14:20
 */
public abstract class Component {

	//实现所有类共有接口的默认行为，声明用于访问管理component的子部件

	protected String name;
	public Component(String name){
		this.name = name;
	}

	public abstract void add(Component c);
	public abstract void remove(Component c);

	public abstract void display(int depth);
}
