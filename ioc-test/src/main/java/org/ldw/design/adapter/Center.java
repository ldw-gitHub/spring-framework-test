package org.ldw.design.adapter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:33
 */
public class Center extends Player{
	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("中锋进攻" + name);
	}

	@Override
	public void defense() {
		System.out.println("中锋防守" + name);
	}

	//中锋

}
