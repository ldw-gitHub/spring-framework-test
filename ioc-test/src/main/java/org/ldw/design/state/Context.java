package org.ldw.design.state;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 14:22
 */
public class Context {

	private State state;

	//定义context的初始状态
	public Context(State state){
		this.state = state;
	}

	public void request(){
		state.handle(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态 ： " + state.toString());
	}
}
