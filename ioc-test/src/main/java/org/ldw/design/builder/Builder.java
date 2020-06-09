package org.ldw.design.builder;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 10:48
 */
abstract class Builder {

	//抽象建造者类，确定 产品由两个部件partA和partB组成
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
