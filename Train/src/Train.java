
public class Train<T> {
	private Wagon<T> head;
	
	public Wagon<T> getHead() {
		return head;
	}
	
	public int size() {
		if (head == null)
			return 0;
		return head.size();
	}
	
	public void prepend(T x) {
		Wagon<T> w = new Wagon<T>(x, head);
		head = w;
	}
	
	public void prepend(Wagon<T> w) {
		w.setNext(head);
		head = w;
	}
}
