package misc.linklist.simple;

public class LinkedList {
	private Node head;

	public LinkedList() {

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * This method will add a value to the end of a list.
	 * 
	 * @param value
	 */
	public void add(String value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return;
		}
		findLeaf(head).setNext(node);
	}

	/**
	 * This method will find the leaf node from the node passed in.
	 * 
	 * @param node
	 *            Cannot be null.
	 * @return Node which has null as a Next.
	 * @throws IllegalArgumentException
	 *             if node is null.
	 */
	static Node findLeaf(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			throw new IllegalArgumentException("Node is null.");
		}
		if (node.getNext() == null) {
			return node;
		}
		return findLeaf(node.getNext());
	}

	public void print() {
		String outputString = "";
		if (head == null) {
			outputString = "List is empty";
		} else {
			Node currentItem = head;
			do {
				outputString += currentItem.getValue();
				if (currentItem.getNext() != null) {
					outputString += " > ";
				}
				currentItem = currentItem.getNext();
			} while (currentItem != null);
		}
		System.out.println(outputString);
	}

}