package org.ldw.design.responsibility;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/15 15:16
 */
public class Majordomo extends Manager {
	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		System.out.println("{0}{1}数量{2} 被审批" + name + request.getRequestContent() + request.getRequestType());
		if ("请假".equals(request.getRequestType()) && request.getNumber() > 5) {
			if (superior != null)
				superior.requestApplications(request);
		}

	}
}
