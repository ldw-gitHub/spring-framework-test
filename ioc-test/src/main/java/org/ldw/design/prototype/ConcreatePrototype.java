package org.ldw.design.prototype;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/1 17:05
 */
public class ConcreatePrototype extends Prototype {

	public ConcreatePrototype (String id){
		super(id);
	}

	@Override
	public Prototype clone() {
		return this;
	}
}
