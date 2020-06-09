package org.ldw.design.observer;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 11:44
 */
public class ConcreateSubject extends Subject{

	//具体被观察者状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
}
