package org.ldw.design.prototype;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/1 16:37
 */
public abstract class Prototype {

	/**
	 * 原型模式：
	 *   从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节
	 *
	 *
	 */

	private String id;

	public Prototype(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public abstract Prototype clone();
}
