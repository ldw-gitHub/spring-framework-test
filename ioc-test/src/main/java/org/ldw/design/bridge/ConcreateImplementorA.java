package org.ldw.design.bridge;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/15 10:39
 */
public class ConcreateImplementorA extends Implementor {
	@Override
	public void operation() {
		System.out.println("具体实现A的方法执行");
	}
}
