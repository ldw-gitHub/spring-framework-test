package org.ldw.design.visitor;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 10:15
 */
public class Success extends Action {
	@Override
	public void getManConclusion(Man man) {
		System.out.println("背后女人的功劳");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("背后有一个不成功的男人");
	}
}
