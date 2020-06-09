package org.ldw.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 10:45
 */
public class Product {

	List<String> parts = new ArrayList<>();

	//添加产品部件
	public void add(String part){
		parts.add(part);
	}

	//列举所有产品部件
	public void show(){
		System.out.println("产品创建");
		for(String s:parts){
			System.out.println(s);
		}
	}
}
