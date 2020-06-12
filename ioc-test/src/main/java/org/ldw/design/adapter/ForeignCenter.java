package org.ldw.design.adapter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:36
 */
public class ForeignCenter {

	private String name;

	public void attack() {
		System.out.println("外籍中锋进攻" + this.name);
	}

	public void defense() {
		System.out.println("外籍中锋防守" + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
