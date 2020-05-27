package org.ldw.design.strategy;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/26 16:56
 */
public class Context {

	Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	//添加工厂方法
	public Context(String type){
		switch (type){
			case "A":
				this.strategy = new StrategyA();
				break;
			case "B":
				this.strategy = new StrategyB();
				break;
		}

	}


	public void ContextInterface(){
		strategy.AlgorithmInterfase();
	}
}
