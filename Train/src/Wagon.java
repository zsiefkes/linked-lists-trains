
public class Wagon<Q> {
	private Q value;
	private Wagon<Q> next;
	
	public Q getValue() {
		return value;
	}
	
	public Wagon<Q> getNext() {
		return next;
	}
	
	public Wagon(Q val, Wagon<Q> n) {
		value = val;
		next = n;
	}
	
	public int size() {
		if (next == null) {
			return 1;
		}
		return 1 + next.size();
	}
	
	public void setNext(Wagon<Q> n) {
		next = n;
	}
}
