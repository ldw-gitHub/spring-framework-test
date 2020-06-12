package org.ldw.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 14:27
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuffer s = new StringBuffer("-");
		for(int i = depth;i > 0;i--){
			s.append("-");
		}
		System.out.println(s + name);
		for(Component component:children){
			component.display(depth + 2);
		}
	}
}
