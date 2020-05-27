package org.ldw.design.decoration;

/**
 * @description 具体的装饰对象，起到给Component 添加职责的功能
 * @author: liudawei
 * @date: 2020/5/27 12:04
 */
public class ConcreateDecoratorA extends Decorator{

	private String addeState;

	@Override
	public void operation() {
		super.operation();
		addeState = "new State";
		System.out.println("具体装饰对象A的操作");
	}
}
