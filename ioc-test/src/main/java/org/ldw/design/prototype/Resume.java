package org.ldw.design.prototype;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/2 18:24
 */
public class Resume implements Cloneable {

	private String username;
	private int age;

	private String company;

	public void setWorkExperience(String company) {
		this.company = company;
	}

	public void setUserInfo(String username, int age) {
		this.username = username;
		this.age = age;
	}

	/**
	 * 深度复制，包含的对象也要克隆
	 * @return
	 */
	@Override
	public Object clone() {
		Resume resume = null;
		try {
			resume = (Resume) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}

	@Override
	public String toString() {
		return "Resume{" +
				"username='" + username + '\'' +
				", age=" + age +
				", company='" + company + '\'' +
				'}';
	}
}
