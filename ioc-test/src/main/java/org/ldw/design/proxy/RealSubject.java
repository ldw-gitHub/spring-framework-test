package org.ldw.design.proxy;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/27 16:34
 */
public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("真实请求");
	}
}
