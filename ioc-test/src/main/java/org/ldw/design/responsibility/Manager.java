package org.ldw.design.responsibility;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/15 14:50
 */
public abstract class Manager {

	protected String name;
	//管理者的上级
	protected Manager superior;

	public Manager (String name){
		this.name = name;
	}

	//设置管理者的上级
	public void setSuperior(Manager superior){
		this.superior = superior;
	}

	//申请请求
	abstract public void requestApplications(Request request);



}
