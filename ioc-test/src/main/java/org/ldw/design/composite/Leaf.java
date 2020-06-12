package org.ldw.design.composite;

/**
 * @description
 * @author: liudawei
 * @date: 2020/6/11 14:24
 */
public class Leaf extends Component {
	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("can not add to a leaf");
	}

	@Override
	public void remove(Component c) {
		System.out.println("can not remove from a leaf");
	}

	@Override
	public void display(int depth) {
		StringBuffer s = new StringBuffer("-");
		for(int i = depth;i > 0;i--){
			s.append("-");
		}
		System.out.println(s + name);
	}
}
