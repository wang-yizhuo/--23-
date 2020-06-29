package M;

public class Test {
	public boolean test1() {
		ThingList list = new ThingList();
		Thing th1 = new Thing(1,2020,06,27,"world");
		Thing th2 = new Thing(2,2020,06,28,"hello");
		Thing th3 = new Thing(3,2020,06,29,"helloworld");
		list.add(th1);list.add(th2);list.add(th3);
		String res = "1 2020年6月27日: world 状态: false\n" + 
					"2 2020年6月28日: hello 状态: false\n" + 
					"3 2020年6月29日: helloworld 状态: false\n";
		return list.toString().equalsIgnoreCase(res);
	}
	public boolean test2() {
		ThingList list = new ThingList();
		Thing th1 = new Thing(1,2020,06,27,"world");
		Thing th2 = new Thing(2,2020,06,28,"hello");
		Thing th3 = new Thing(3,2020,06,29,"helloworld");
		list.add(th1);
		list.add(th2);
		list.add(th3);
		list.del(1);
		String res = "2 2020年6月28日: hello 状态: false\n" + 
					"3 2020年6月29日: helloworld 状态: false\n";
		return list.toString().equalsIgnoreCase(res);
	}
	public boolean test3() {
		ThingList list = new ThingList();
		Thing th1 = new Thing(1,2020,06,27,"world");
		Thing th2 = new Thing(2,2020,06,28,"hello");
		Thing th3 = new Thing(3,2020,06,29,"helloworld");
		list.add(th1);
		list.add(th2);
		list.add(th3);
		boolean flag = true;
		list.edit(2, flag);
		String res = "1 2020年6月27日: world 状态: false\n" + 
					"2 2020年6月28日: hello 状态: true\n" + 
					"3 2020年6月29日: helloworld 状态: false\n";
		return list.toString().equalsIgnoreCase(res);
	}
	public boolean test4() {
		ThingList list = new ThingList();
		Thing th1 = new Thing(1,2020,06,27,"world");
		Thing th2 = new Thing(2,2020,06,28,"hello");
		Thing th3 = new Thing(3,2020,06,29,"helloworld");
		list.add(th1);
		list.add(th2);
		list.add(th3);
		boolean flag = true;
		list.edit(2, flag);
		list.del(1);
		String res = "2 2020年6月28日: hello 状态: true\n" + 
				"3 2020年6月29日: helloworld 状态: false\n";
		return list.toString().equalsIgnoreCase(res);
	}
	public static void main(String[] args) {
		Test t = new Test();
		if(!t.test1() || !t.test2() || !t.test3() || !t.test4())
			System.out.println("Wrong!");
		else
			System.out.println("Good!");
	}
}
