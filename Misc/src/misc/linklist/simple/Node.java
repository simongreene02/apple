package misc.linklist.simple;

public class Node {
	private final String value;
	private Node next;
	
	public Node(String value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	
	
	
	
}
