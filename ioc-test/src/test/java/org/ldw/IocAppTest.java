package org.ldw;

import com.sun.webkit.graphics.WCMediaPlayer;
import org.ldw.design.abstractfactory.DataAccess;
import org.ldw.design.abstractfactory.SqlServerUser;
import org.ldw.design.abstractfactory.User;
import org.ldw.design.adapter.Forwards;
import org.ldw.design.adapter.Player;
import org.ldw.design.adapter.Translator;
import org.ldw.design.bridge.Abstraction;
import org.ldw.design.bridge.ConcreateImplementorA;
import org.ldw.design.bridge.ConcreateImplementorB;
import org.ldw.design.bridge.DefinedAbstraction;
import org.ldw.design.builder.ConcreateBuilder1;
import org.ldw.design.builder.ConcreateBuilder2;
import org.ldw.design.builder.Director;
import org.ldw.design.builder.Product;
import org.ldw.design.composite.Composite;
import org.ldw.design.composite.Leaf;
import org.ldw.design.facade.Facade;
import org.ldw.design.interpreter.AbstractExpression;
import org.ldw.design.interpreter.Context;
import org.ldw.design.interpreter.NonterminalExpression;
import org.ldw.design.interpreter.TerminalExpression;
import org.ldw.design.iterator.ConcreateAggregate;
import org.ldw.design.iterator.Iterator;
import org.ldw.design.memento.Caretaker;
import org.ldw.design.memento.Originator;
import org.ldw.design.observer.ConcreateObserver;
import org.ldw.design.observer.ConcreateSubject;
import org.ldw.design.responsibility.CommonManager;
import org.ldw.design.responsibility.Majordomo;
import org.ldw.design.responsibility.Request;
import org.ldw.design.singleton.Singleton;
import org.ldw.design.state.ConcreateStateA;
import org.ldw.design.visitor.*;

import java.util.ArrayList;
import java.util.List;

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

	public static void main(String[] args) throws Exception {


		//UML 类图


		//1、策略模式(strategy)：可以用来封装几乎任何类型的规则，相同得方法，不同得结构
		// 只要在分析过程中听到需要在不同的时间应用不同的业务规则，
		// 就可以考虑使用策略模式处理这种变化的可能性
/*		Context context = new Context(new StrategyA());
		context.ContextInterface();
		Context contexta = new Context(new StrategyB());
		contexta.ContextInterface();

		Context contextb = new Context("A");
		contextb.ContextInterface();*/

		//2、装饰模式(decorator)：多个方法或执行动作，可以随意调整执行顺序 可以给这些对象动态地添加职责
/*		ConcreateComponent c = new ConcreateComponent();
		ConcreateDecoratorA d1 = new ConcreateDecoratorA();
		ConcreateDecoratorB d2 = new ConcreateDecoratorB();

		//d2包装d1，d1包装c
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();*/

		//3、代理模式（proxy）：为其它对象提供一种代理以控制对这个对象的访问
	/*	Proxy proxy = new Proxy();
		proxy.request();*/

		//4、原型模式(prototype)：可以给这些对象动态地添加职责 （人员信息）
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

		//5、模板方法模式(templateMethod)：定义一个操作中得算法得骨架，而将一些步骤延迟到子类中，（简历模板）
		// 模板方法使得子类可以不改变一个算法得结构即可重新定义该算法得某些特定步骤
		// 通过把不变得行为搬移到超类，去除子类中得重复代码来体现它得优势
	/*	TamplateA tamplateA = new TamplateA();
		tamplateA.templateMethods();
		TamplateB tamplateB = new TamplateB();
		tamplateB.templateMethods();*/

		//6、外观模式-门面模式(facade)：为子系统中的一组接口提供一个一致的界面，此模式定义一个高层接口，这个接口使得这一子系统更加容易使用（炒股基金组合）
		//首先，在设计初期阶段，应该要有意识的将不同的两个层分离
		//其次，在开放阶段，子系统往往因为不断的重构演化而变得越来越复杂
		//第三，在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展了
		/*Facade facade = new Facade();
		facade.methodA();
		System.out.println("----------------------");
		facade.methodB();*/

		//7、建造者模式-生成器模式(builder)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
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


		//8、观察者模式-（发布-订阅模式）(observer)：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
		//这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己
//		ConcreateSubject s = new ConcreateSubject();
//		s.attach(new ConcreateObserver("X",s));
//		s.attach(new ConcreateObserver("Y",s));
//		s.attach(new ConcreateObserver("Z",s));
//
//		s.setSubjectState("ABC");
//		s.notifys();
		//当一个对象的改变需要同时改变其它对象的时候，而且它不知道具体有多少对象有待改变，应该考虑使用观察者模式
		//观察者模式所作的工作其实就是在解除耦合，让耦合的双方都依赖于抽象，而不是依赖于具体，从而使得它们各自独立地改变和复用
		//事件委托实现

		//9、抽象工厂模式(abstract Factory)：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类

		//用反射+抽象工厂的数据访问程序
		/*SqlServerUser baseSql = DataAccess.createBaseSql();
		baseSql.insert(new User());*/

		//10、状态模式(state)：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
		//主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化
//		Context context = new Context(new ConcreateStateA());
//		context.request();
//		context.request();
//		context.request();
//		context.request();

		//11、适配器模式(adapter):
		//将一个类的接口转换成客户希望的另外一个接口，适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
		//类适配器模式/对象适配器模式
//		Player b = new Forwards("巴蒂尔");
//		b.attack();
//		Player ym = new Translator("姚明");
//		ym.attack();
//		ym.defense();


		//12、备忘录模式(memento)：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复之前的状态
		//适用功能比较复杂，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分
//		Originator o = new Originator();
//		o.setState("on");
//		o.show();
//
//		Caretaker c = new Caretaker(); //保存状态
//		c.setMemento(o.createMemento());
//
//		o.setState("off"); //更改状态
//		o.show();
//
//		o.setMemento(c.getMemento()); //恢复存档状态
//		o.show();

		//13、组合模式（composite）:将对象组合成树形结构以表示‘部分-整体’的层次结构。
		//组合模式使得用户对单个对象和组合对象的使用具有一致性
//		Composite root = new Composite("root");//生成树根root，根上长出两叶LeafA和LeafB
//		root.add(new Leaf("Leaf A"));
//		root.add(new Leaf("Leaf B"));
//
//		Composite comp = new Composite("Composite X");//根上长出分枝CompositeX，分枝也有两叶子
//		comp.add(new Leaf("Leaf XA"));
//		comp.add(new Leaf("Leaf XB"));
//
//		root.add(comp);
//
//		Composite comp2 = new Composite("Composite XY");//CompositeX在长出分枝，分枝也有两叶子
//		comp2.add(new Leaf("Leaf XYA"));
//		comp2.add(new Leaf("Leaf XYB"));
//
//		comp.add(comp2);
//
//		root.display(1);

		//14、迭代器模式(iterator) : 提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
		//一个聚焦对象，而且不管这些对象是什么都需要遍历的时候，你就应该考虑用迭代器模式
//		ConcreateAggregate a = new ConcreateAggregate();
//		a.setIndex(0,"大佬");
//		a.setIndex(1,"中佬");
//		a.setIndex(2,"屌丝");
//		a.setIndex(3,"美女");
//		a.setIndex(4,"巨物");
//		a.setIndex(5,"巨人");
//
//		Iterator iterator = a.createIterator();
//		while(!iterator.isDone()){
//			System.out.println(iterator.currentItem());
//			iterator.next();
//		}


		//15、单例模式(singleton)：保证一个类仅有一个实例，并提供一个访问它的全局访问点
		//封装它的唯一实例，这样它可以严格地控制客户怎样访问它，以及何时访问它，简单地说就是对唯一实例的受控访问
//		Singleton instance = Singleton.getInstance();
//		Singleton instance1 = Singleton.getInstance();
//		System.out.println(instance);
//		System.out.println(instance1);


		//16、桥接模式(bridge)：将抽象部分与它的实现部分分离，使它们都可以独立的变化
		//合成/聚合复用原则，尽量使用合成/聚合，尽量不要使用类继承
		//实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合
//		Abstraction ab = new DefinedAbstraction();
//
//		ab.setImplementor(new ConcreateImplementorA());
//		ab.operation();
//
//		ab.setImplementor(new ConcreateImplementorB());
//		ab.operation();

		//17、命令模式(command)：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作

		//18、职责链模式(chain of Responsibility)：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系
		//将这个对象练成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止

//		CommonManager jinli = new CommonManager("石凯");
//		Majordomo zongjian = new Majordomo("黄河");
//
//		Request request = new Request();
//		request.setRequestType("请假");
//		request.setRequestContent("有事回家");
//		request.setNumber(4);
//
//		//请假审批
//		jinli.setSuperior(zongjian);
//		jinli.requestApplications(request);

		//19、中介者模式/调停者模式（mediator）：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
		//中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合
		//以及想定制一个分布在多个类中的行为，而不想生成太多的子类的场合


		//20、享元模式（flyweight）:运用共享技术有效地支持大量细粒度的对象

		//21、解释器模式（interpreter）：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
		//当一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可以用解释器模式
//		Context context = new Context();
//		List<AbstractExpression> list = new ArrayList<>();
//		list.add(new TerminalExpression());
//		list.add(new NonterminalExpression());
//		list.add(new TerminalExpression());
//		list.add(new TerminalExpression());
//
//		list.stream().forEach(e -> {
//			e.interpret(context);
//		});

		//22、访问者模式(visitor)：表示一个作用于某个对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
		List<Person> list = new ArrayList<>();
		list.add(new Woman());
		list.add(new Man());
		list.stream().forEach(e -> {
			e.accept(new Success());
			e.accept(new Marriage());
		});

		//23、总结：只要真正深入地理解了设计模式，很多设计模式其实就是原则的应用而已，或许在不知不觉中就在使用设计模式了

		/**
		 * 一、创建型模式：
		 * 		1、单例模式(singleton)：保证一个类仅有一个实例，并提供一个访问它的全局访问点。封装它的唯一实例，这样它可以严格地控制客户怎样访问它，以及何时访问它，简单地说就是对唯一实例的受控访问
		 * 		2、工厂方法模式
		 * 		3、抽象工厂模式：提供一个创建一系列或相关依赖对象的接口，而无需指定它们具体的类
		 * 		4、建造者模式
		 * 		5、原型模式
		 * 二、结构型模式（外观模式）：
		 * 		1、适配器模式
		 * 		2、装饰模式
		 * 	 	3、桥接模式
		 * 	 	4、组合模式
		 * 	 	5、享元模式
		 * 	 	6、代理模式
		 * 	 	7、外观模式
		 * 三、行为型模式：
		 * 		1、观察者模式
		 * 		2、模板方法模式
		 * 		3、命令模式
		 * 		4、状态模式
		 * 		5、职责链模式
		 * 四、策略型模式：
		 * 		1、解释器模式
		 * 		2、中介者模式
		 * 		3、访问者模式
		 * 		4、策略模式
		 * 		5、备忘录模式
		 * 		6、迭代器模式
		 *
		 *
		 *
		 */











		


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
