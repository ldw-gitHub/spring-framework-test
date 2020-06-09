package org.ldw.design.facade;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/8 15:26
 */
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;

	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
	}

	public void methodA(){
		one.methodOne();
		two.methodTwo();
	}

	public void methodB(){
		two.methodTwo();
		three.methodThree();
	}
}
