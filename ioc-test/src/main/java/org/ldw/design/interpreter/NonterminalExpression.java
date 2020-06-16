package org.ldw.design.interpreter;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/16 9:51
 */
public class NonterminalExpression extends AbstractExpression {
	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");
	}
}
