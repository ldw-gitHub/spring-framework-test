package org.ldw.design.decoration;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/27 15:25
 */
public abstract class Decorator extends Component{
	/**
	 * 装饰模式：动态地给一个对象添加一些额外的职责，就添加功能来说，装饰模式比生成子类更为灵活
	 *
	 * 继承Component,扩展Component功能
	 */


	protected Component component;

	public void setComponent(Component component){
		this.component = component;
	}

	@Override
	public void operation() {
		if(component != null){
			component.operation();
		}
	}
}
