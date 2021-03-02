package org.ldw;

import org.ldw.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/30 15:10
 */
public class AppApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		User user = ctx.getBean("user", User.class);
		System.out.println(user);
	}
}
