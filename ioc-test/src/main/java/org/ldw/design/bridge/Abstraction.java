package org.ldw.design.bridge;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/15 10:42
 */
public class Abstraction {

	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void operation(){
		implementor.operation();
	}
}
