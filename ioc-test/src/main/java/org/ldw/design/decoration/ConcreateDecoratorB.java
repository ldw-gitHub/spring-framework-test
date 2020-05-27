package org.ldw.design.decoration;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/27 15:31
 */
public class ConcreateDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void addedBehavior(){
		System.out.println("B的特殊方法");
	}
}
