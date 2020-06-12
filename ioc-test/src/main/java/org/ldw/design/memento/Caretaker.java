package org.ldw.design.memento;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 10:55
 */
public class Caretaker {

	//管理者类

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
