package org.ldw.design.adapter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:33
 */
public class Forwards extends Player{
	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋进攻" + name);
	}

	@Override
	public void defense() {
		System.out.println("前锋防守" + name);
	}

	//前锋

}
