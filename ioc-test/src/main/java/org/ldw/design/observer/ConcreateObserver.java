package org.ldw.design.observer;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 11:46
 */
public class ConcreateObserver extends Observer{

	//具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调

	private String name;
	private String observerState;
	private ConcreateSubject subject;

	public ConcreateObserver(String name, ConcreateSubject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
       this.observerState = subject.getSubjectState();
		System.out.println("观察者（0）的新状态是【1】" + this.name + observerState);
	}

	public ConcreateSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreateSubject subject) {
		this.subject = subject;
	}
}
