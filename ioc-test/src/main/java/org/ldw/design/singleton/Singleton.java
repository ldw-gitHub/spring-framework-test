package org.ldw.design.singleton;

import java.util.concurrent.locks.Lock;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/12 10:51
 */
public class Singleton {

	private static Singleton instance;

	private static final Object syncRoot = new Object();
	//饿汉式，在自己被加载时就自己实例化了
//	private static final Singleton singleton = new Singleton();

	private Singleton(){}

	//双重锁定 --- 懒汉式，需要第一次调用才会创建
	public static Singleton getInstance(){

		if(instance == null){
			synchronized (syncRoot){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

	//影响性能
/*	public static Singleton getInstance(){
		synchronized (syncRoot){
			if(instance == null){
				instance = new Singleton();
			}

			return instance;
		}
	}*/
}
