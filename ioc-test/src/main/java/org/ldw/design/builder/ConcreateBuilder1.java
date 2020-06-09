package org.ldw.design.builder;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 10:51
 */
public class ConcreateBuilder1 extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
