package org.ldw.design.visitor;

/**
 * @description 状态
 * @author: liudawei
 * @date: 2020/6/16 10:09
 */
public abstract class Action {

	public abstract void getManConclusion(Man man);

	public abstract void getWomanConclusion(Woman woman);

}
