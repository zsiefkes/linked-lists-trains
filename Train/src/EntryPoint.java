
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
	
	public static void main(String[] args) {
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

}
