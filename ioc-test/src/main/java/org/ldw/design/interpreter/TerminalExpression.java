package org.ldw.design.interpreter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 9:50
 */
public class TerminalExpression extends AbstractExpression {
	@Override
	public void interpret(Context context) {
		System.out.println("终端解释器");
	}
}
