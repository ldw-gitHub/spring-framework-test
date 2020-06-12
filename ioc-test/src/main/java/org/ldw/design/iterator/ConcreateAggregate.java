package org.ldw.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description  具体聚集类
 * @author: liudawei
 * @date: 2020/6/12 9:58
 */
public class ConcreateAggregate extends Aggregate {

	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator createIterator() {
		return new ConcreateIterator(this);
	}
	public int count(){
		return items.size();
	}

	public Object getIndex(int index){
		return items.get(index);
	}

	public void setIndex(int index,Object value){
		items.add(index,value);
	}

	public void add(int index,Object value){
		items.add(value);
	}


}
