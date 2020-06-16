package org.ldw.design.visitor;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 10:16
 */
public class Marriage extends Action {
	@Override
	public void getManConclusion(Man man) {
		System.out.println("恋爱游戏终结");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("爱情长跑路漫漫");
	}
}
