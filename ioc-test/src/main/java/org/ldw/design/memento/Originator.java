package org.ldw.design.memento;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:53
 */
public class Originator {

	//发起人类

	private String state;

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memento){
		state = memento.getState();
	}

	public void show(){
		System.out.println("state === " + state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
