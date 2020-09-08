import java.util.ArrayList;
import java.util.List;

public class Tree {
	private List<Tree> children = new ArrayList<Tree>();
	private String value;
	
	public Tree(String value) {
		this.value = value;
	}
	
	public void addChild(Tree t) {
		children.add(t);
	}
	
	public String toString() {
		return value;
	}
	
	public List<Tree> getChildren() {
		return children;
	}
}
