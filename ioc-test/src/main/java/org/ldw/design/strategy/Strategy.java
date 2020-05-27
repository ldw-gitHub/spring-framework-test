package org.ldw.design.strategy;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/26 16:52
 */
public interface Strategy {

	/**
	 * 定义算法家族，分别封装，让它们之间可以相互替换，此模式让算法的变化，不会影响到使用算法的客户
	 *
	 * 策略模式：可以用来封装几乎任何类型的规则，只要在分析过程中听到需要在不同的时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性
	 *
	 */

	public abstract void AlgorithmInterfase();
}
