package org.ldw.design.observer;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 11:27
 */
abstract class Observer {

	//抽象观察者，为所有具体观察者定义一个接口，在得到主题的通知时更新自己
	public abstract void update();
}
