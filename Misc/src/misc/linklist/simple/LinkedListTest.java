package misc.linklist.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListTest {
	private LinkedList list;

	@Before
	public void setUp() {
		list = new LinkedList();
	}

	@Test
	public void testGetHead_null() {
		assertNull(list.getHead());
	}
	
	@Test
	public void testGetHead_add() {
		list.add("a");
		assertEquals("a", list.getHead().getValue());
	}
	
	@Test
	public void testGetHead_set() {
		Node node = new Node("a");
		list.setHead(node);
		assertSame(node, list.getHead());
	}

	@Test
	public void setHead() {
		list.add("");
		list.setHead(new Node(" "));
		assertEquals(" ", list.getHead().getValue());
	}

	@Test
	@Ignore("Todo")
	public void testPrint() {
		fail("Not yet implemented");
	}
	
	@Test
	public void findLeaf() {
		Node node1 = new Node("");
		Node node2 = new Node("");
		Node node3 = new Node("");
		Node node4 = new Node("");
		Node node5 = new Node("");
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		assertSame(node5, LinkedList.findLeaf(node1));
	}
	
	@Test
	public void add_withHead() {
		Node node1 = new Node("");
		list.setHead(node1);
		list.add(" ");
		assertEquals(" ", LinkedList.findLeaf(node1).getValue());
	}
	
	@Test
	public void add_withoutHead() {
		list.add(" ");
		assertEquals(" ", list.getHead().getValue());
	}

}
