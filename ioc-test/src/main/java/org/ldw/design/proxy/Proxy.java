package org.ldw.design.proxy;

/**
 * @description 代理类：为其它对象提供一种代理以控制对这个对象的访问
 * @author: liudawei
 * @date: 2020/5/27 16:16
 */
public class Proxy extends Subject {

	/**
	 * 远程代理：一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在不同地址空间的事实
	 * <p>
	 * 虚拟代理：根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象
	 * <p>
	 * 安全代理：用来控制真实对象访问时的权限
	 * <p>
	 * 智能指引：当调用真实的对象时，代理处理另外一些事
	 */

	RealSubject realSubject;

	@Override
	public void request() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}

		realSubject.request();
	}

}
