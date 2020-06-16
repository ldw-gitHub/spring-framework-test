package org.ldw.design.visitor;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 10:11
 */
public class Man extends Person {
	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}
}
