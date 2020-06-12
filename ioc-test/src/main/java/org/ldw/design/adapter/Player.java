package org.ldw.design.adapter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:32
 */
public abstract class Player {

	protected String name;

	public Player(String name){
		this.name = name;
	}

	public abstract void attack();//进攻
	public abstract void defense();//防守
}
