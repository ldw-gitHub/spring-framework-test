package org.ldw;

import org.junit.Test;
import org.ldw.design.decoration.ConcreateComponent;
import org.ldw.design.decoration.ConcreateDecoratorA;
import org.ldw.design.decoration.ConcreateDecoratorB;
import org.ldw.design.proxy.Proxy;
import org.ldw.design.strategy.Context;
import org.ldw.design.strategy.Strategy;
import org.ldw.design.strategy.StrategyA;
import org.ldw.design.strategy.StrategyB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lang.Nullable;
import org.ldw.model.User;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/22 10:19
 */
public class IocAppTest {

	public static void main(String[] args) {
		//策略模式
/*		Context context = new Context(new StrategyA());
		context.ContextInterface();
		Context contexta = new Context(new StrategyB());
		contexta.ContextInterface();

		Context contextb = new Context("A");
		contextb.ContextInterface();*/

		//装饰模式、多个方法或执行动作，可以随意调整执行顺序
/*		ConcreateComponent c = new ConcreateComponent();
		ConcreateDecoratorA d1 = new ConcreateDecoratorA();
		ConcreateDecoratorB d2 = new ConcreateDecoratorB();

		//d2包装d1，d1包装c
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();*/

		//代理模式
		Proxy proxy = new Proxy();
		proxy.request();

	}

	@Test
	public void getBean(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

//		System.out.println("getApplicationName() = " + ctx.getApplicationName());
//		System.out.println("getDisplayName() = " + ctx.getDisplayName());
//		System.out.println("getStartupDate() = " + ctx.getStartupDate());

		User user = ctx.getBean("user", User.class);
		System.out.println(user);
/*		HelloWorld HelloWorld = ctx.getBean("proxy", HelloWorld.class);

		HelloWorld.printHelloWorld();
		System.out.println();
		HelloWorld.doPrint();*/

	}

	public String checkIsNull(@Nullable  String a){
		return a;
	}

}
