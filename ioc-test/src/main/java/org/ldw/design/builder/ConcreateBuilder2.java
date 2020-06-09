package org.ldw.design.builder;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/9 10:52
 */
public class ConcreateBuilder2 extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
