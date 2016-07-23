package misc.linklist.simple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {

	@Test
	public void oneNodeInit() {
		Node node1 = new Node("ABC");
		assertEquals("ABC", node1.getValue());
		assertNull(node1.getNext());
	}
	
	@Test
	public void twoNodesInit() {
		Node node1 = new Node("ABC");
		Node node2 = new Node("CAB");
		node1.setNext(node2);
		assertSame(node2, node1.getNext());
		assertNull(node2.getNext());
	}

}
