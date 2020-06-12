package org.ldw.design.iterator;

/**
 * @description  具体迭代器类
 * @author: liudawei
 * @date: 2020/6/12 9:57
 */
public class ConcreateIterator extends Iterator {

	private ConcreateAggregate aggregate;
	private int current = 0;

	public ConcreateIterator(ConcreateAggregate aggregate){
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getIndex(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if(current < aggregate.count()){
			ret = aggregate.getIndex(current);
		}
		return ret;
	}

	@Override
	public Boolean isDone() {
		return current >= aggregate.count() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getIndex(current);
	}
}
