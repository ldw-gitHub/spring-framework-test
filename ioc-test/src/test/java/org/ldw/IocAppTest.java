package org.ldw;

import org.ldw.design.builder.ConcreateBuilder1;
import org.ldw.design.builder.ConcreateBuilder2;
import org.ldw.design.builder.Director;
import org.ldw.design.builder.Product;
import org.ldw.design.facade.Facade;
import org.ldw.design.observer.ConcreateObserver;
import org.ldw.design.observer.ConcreateSubject;

/**
 * @description
 * @author: liudawei
 * @date: 2020/5/22 10:19
 */
public class IocAppTest {

	/**
	 * 设计原则：
	 *
	 * 单一职责原则：就一个类而言，应该仅有一个引起它变化得原因
	 *
	 * 开放-封闭原则：软件实体（类、模块、函数等等），应该可以扩展。但是不可修改，对于扩展是开放得，对于更改是封闭得
	 *
	 * 依赖倒转原则：A：高层模块不应该依赖底层模块，两个都应该依赖抽象；B：抽象不应该依赖细节。细节应该依赖抽象
	 *
	 * 迪米特法则：如果两个类不必彼此直接通信，那么这两个类就不应当发生直接得相互作用，如果其中一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用
	 * 			在类的结构设计上，每一个类都应当尽量降低成员的访问权限；
	 * 		    强调类之间的松耦合
	 *
	 *
	 * @param args
	 * @throws CloneNotSupportedException
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		//1、策略模式：可以用来封装几乎任何类型的规则，相同得方法，不同得结构
		// 只要在分析过程中听到需要在不同的时间应用不同的业务规则，
		// 就可以考虑使用策略模式处理这种变化的可能性
/*		Context context = new Context(new StrategyA());
		context.ContextInterface();
		Context contexta = new Context(new StrategyB());
		contexta.ContextInterface();

		Context contextb = new Context("A");
		contextb.ContextInterface();*/

		//2、装饰模式、多个方法或执行动作，可以随意调整执行顺序 可以给这些对象动态地添加职责
/*		ConcreateComponent c = new ConcreateComponent();
		ConcreateDecoratorA d1 = new ConcreateDecoratorA();
		ConcreateDecoratorB d2 = new ConcreateDecoratorB();

		//d2包装d1，d1包装c
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();*/

		//3、代理模式：为其它对象提供一种代理以控制对这个对象的访问
	/*	Proxy proxy = new Proxy();
		proxy.request();*/

		//4、原型模式：可以给这些对象动态地添加职责 （人员信息）
		/*ConcreatePrototype p1 = new ConcreatePrototype("1");
		ConcreatePrototype p2 = (ConcreatePrototype) p1.clone();

		System.out.println(p2.equals(p1));*/

//		Resume r = new Resume();
//		r.setUserInfo("ldw",6);
//
//		Resume r1 = (Resume)r.clone();
//		r1.setUserInfo("sq",12);
//
//		System.out.println(r.toString());
//		System.out.println(r1.toString());
//		System.out.println(r == r1);
//		System.out.println(r.equals(r1));

		//5、模板方法模式：定义一个操作中得算法得骨架，而将一些步骤延迟到子类中，（简历模板）
		// 模板方法使得子类可以不改变一个算法得结构即可重新定义该算法得某些特定步骤
		// 通过把不变得行为搬移到超类，去除子类中得重复代码来体现它得优势
	/*	TamplateA tamplateA = new TamplateA();
		tamplateA.templateMethods();
		TamplateB tamplateB = new TamplateB();
		tamplateB.templateMethods();*/

		//6、外观模式-门面模式：为子系统中的一组接口提供一个一致的界面，此模式定义一个高层接口，这个接口使得这一子系统更加容易使用（炒股基金组合）
		//首先，在设计初期阶段，应该要有意识的将不同的两个层分离
		//其次，在开放阶段，子系统往往因为不断的重构演化而变得越来越复杂
		//第三，在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了
		/*Facade facade = new Facade();
		facade.methodA();
		System.out.println("----------------------");
		facade.methodB();*/

		//7、建造者模式-生成器模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
/*		Director director = new Director();
		ConcreateBuilder1 concreateBuilder1 = new ConcreateBuilder1();
		ConcreateBuilder2 concreateBuilder2 = new ConcreateBuilder2();

		director.construct(concreateBuilder1);
		Product result = concreateBuilder1.getResult();
		result.show();

		director.construct(concreateBuilder2);
		Product result1 = concreateBuilder2.getResult();
		result1.show();*/

		//建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分，以及它们的装配方式时适用的模式


		//8、观察者模式-（发布-订阅模式）：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
		//这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己
		ConcreateSubject s = new ConcreateSubject();
		s.attach(new ConcreateObserver("X",s));
		s.attach(new ConcreateObserver("Y",s));
		s.attach(new ConcreateObserver("Z",s));

		s.setSubjectState("ABC");
		s.notifys();
		//当一个对象的改变需要同时改变其它对象的时候，而且它不知道具体有多少对象有待改变，应该考虑使用观察者模式
		//观察者模式所作的工作其实就是在解除耦合，让耦合的双方都依赖于抽象，而不是依赖于具体，从而使得它们各自独立地改变和复用
		//事件委托实现

		//9、抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类


	}

/*	@Test
	public void getBean(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

//		System.out.println("getApplicationName() = " + ctx.getApplicationName());
//		System.out.println("getDisplayName() = " + ctx.getDisplayName());
//		System.out.println("getStartupDate() = " + ctx.getStartupDate());

		User user = ctx.getBean("user", User.class);
		System.out.println(user);
*//*		HelloWorld HelloWorld = ctx.getBean("proxy", HelloWorld.class);

		HelloWorld.printHelloWorld();
		System.out.println();
		HelloWorld.doPrint();*//*

	}*/

//	public String checkIsNull(@Nullable  String a){
//		return a;
//	}

}
