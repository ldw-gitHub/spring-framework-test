package org.ldw.design.state;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/10 14:26
 */
public class ConcreateStateA extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreateStateB());
	}
}
