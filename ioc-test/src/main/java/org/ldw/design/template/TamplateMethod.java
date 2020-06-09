package org.ldw.design.template;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/8 14:23
 */
abstract class TamplateMethod {

	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethods(){
		primitiveOperation1();
		primitiveOperation2();
	}
}
