
public class EntryPoint {

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static void printTree(Tree t, String prefix) {
		System.out.println(prefix + t);
		for (Tree c : t.getChildren())
			printTree(c, "  " + prefix);
	}

	public static void recursionExamples() {
		System.out.println(factorial(4));
		Tree a = new Tree("hello");
		Tree b = new Tree("world");
		Tree c = new Tree("abc");
		Tree d = new Tree("def");
		Tree e = new Tree("123");
		a.addChild(b);
		a.addChild(c);
		c.addChild(d);
		c.addChild(e);
		a.addChild(new Tree("end"));
		// hello
		//   world
		//   abc
		//     def
		//     123
		printTree(a, "");
	}
	
	public static void printWagons(Wagon<String> w) {
		if (w == null) {
			System.out.println("(end of train)");
			return;
		}
		System.out.println(w.getValue());
		printWagons(w.getNext());
	}
	
	public static void printWagonsIteratively(Wagon<String> w) {
		while (w != null) {
			System.out.println(w.getValue());
			w = w.getNext();
		}
		System.out.println("(end of train)");
	}
	
	public static void printTrain(Train<String> t) {
		Wagon<String> w = t.getHead();
		if (w == null) {
			System.out.println("(empty train)");
		} else {
			printWagons(w);
		}
	}
	
	public static void main(String[] args) {
		Train<String> t = new Train<String>();
		t.prepend("hello");
		System.out.println(t.getHead().getValue());
		t.prepend("world");
		System.out.println(t.getHead().getValue());
		System.out.println(t.getHead().getNext().getValue());
		System.out.println("printTrain:");
		printTrain(t);
		System.out.println(t.getHead().size());
		System.out.println(t.size());
		Wagon<String> w = t.getHead();
		Wagon<String> newWagon = new Wagon<String>("abc", null);
		w.insertAfter(newWagon);
		printTrain(t);
		newWagon.insertAfter(new Wagon<String>("def", null));
		printTrain(t);
		t.appendWagon(new Wagon<String>("???", null));
		System.out.println("---");
		printTrain(t);
		
		w = t.getWagon(2);
		System.out.println(w.getValue());
		
		System.out.println(t.findWagon("hello"));
		System.out.println(t.getWagon(t.findWagon("hello")).getValue());
	}

}
