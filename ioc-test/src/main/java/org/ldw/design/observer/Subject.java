package org.ldw.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 11:26
 */
abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	//增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}

	//移除观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	//通知
	public void notifys() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
