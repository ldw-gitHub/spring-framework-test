package org.ldw.design.builder;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 10:53
 */
public class Director {

	//指挥者类，用来指挥建造过程

	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
