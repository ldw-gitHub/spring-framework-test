package org.ldw.design.responsibility;

/**
 * @description 经理
 * @author: liudawei
 * @date: 2020/6/15 15:04
 */
public class CommonManager extends Majordomo {
	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		System.out.println("{0}{1} 数量{2} 被审批" + name + request.getRequestContent() + request.getNumber());
		if ("请假".equals(request.getRequestType()) && request.getNumber() > 2) {
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}
}
