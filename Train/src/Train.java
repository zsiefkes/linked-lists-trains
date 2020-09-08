
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

	public Wagon<T> getWagon(int i) {
		return head.getWagon(i);
	}

	public int findWagon(T x) {
		int i = 0;
		Wagon<T> w = head;
		while (w != null) {
			if (w.getValue().equals(x))
				break;
			i++;
			w = w.getNext();
		}
		if (w == null)
			return -1;
		return i;
	}

	public T get(int i) {
		return this.getWagon(i).getValue();
	}

	public void remove(int i) {
		if (i == 0) {
			head = head.getNext();
		} else {
			Wagon<T> wagonBefore = this.getWagon(i - 1);
			Wagon<T> removedWagon = this.getWagon(i);
			wagonBefore.setNext(removedWagon.getNext());
		}
	}

	public void insert(int i, T val) {
		if (i == 0) {
			this.prepend(val);
		} else {
			Wagon<T> w = getWagon(i - 1);
			w.insertAfter(new Wagon<T>(val, null));
		}
	}

	public void appendWagon(Wagon<T> w) {
		if (head == null) {
			head = w;
			return;
		}
		Wagon<T> last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(w);
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
