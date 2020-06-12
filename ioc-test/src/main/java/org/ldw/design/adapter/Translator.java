package org.ldw.design.adapter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:37
 */
public class Translator extends Player {

	private ForeignCenter foreignCenter = new ForeignCenter();

	public Translator(String name) {
		super(name);
		foreignCenter.setName(name);
	}

	@Override
	public void attack() {
		foreignCenter.attack();
	}

	@Override
	public void defense() {
		foreignCenter.defense();
	}
}
