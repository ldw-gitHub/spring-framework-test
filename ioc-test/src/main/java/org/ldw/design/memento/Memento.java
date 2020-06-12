package org.ldw.design.memento;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:54
 */
public class Memento {

	//备忘录类

	private String state;

	//构造方法，将相关数据导入
	public Memento(String state){
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
