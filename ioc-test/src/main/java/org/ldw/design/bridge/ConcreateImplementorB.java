package org.ldw.design.bridge;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/15 10:41
 */
public class ConcreateImplementorB extends Implementor {
	@Override
	public void operation() {
		System.out.println("具体实现B的方法执行");
	}
}
