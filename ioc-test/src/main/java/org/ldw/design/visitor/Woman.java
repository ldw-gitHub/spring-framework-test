package org.ldw.design.visitor;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 10:11
 */
public class Woman extends Person {
	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}
}
