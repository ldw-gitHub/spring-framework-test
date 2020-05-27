package org.ldw.aop;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/25 15:32
 */
public class HelloWorldImpl implements HelloWorld {
	@Override
	public void printHelloWorld() {
		System.out.println("HelloWorldImpl --------------------------- printHelloWorld");
	}

	@Override
	public void doPrint() {
		System.out.println("HelloWorldImpl --------------------------- doPrint");
	}
}
