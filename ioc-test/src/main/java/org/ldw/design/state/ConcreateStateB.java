package org.ldw.design.state;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 14:29
 */
public class ConcreateStateB extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreateStateA());
	}
}
