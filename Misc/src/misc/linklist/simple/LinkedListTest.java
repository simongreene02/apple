package misc.linklist.simple;

import static org.junit.Assert.*;

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
	
	@Test
	public void size_empty() {
		assertEquals(0, list.size());
	}
	
	@Test
	public void size_3items() {
		list.add("a");
		list.add("b");
		list.add("c");
		assertEquals(3, list.size());
	}
	
	@Test
	public void delete_null() {
		assertFalse(list.delete(null));
	}
	
	@Test
	public void delete_wrongValue() {
		list.add("a");
		assertFalse(list.delete("b"));
		assertEquals(1, list.size());
	}
	
	@Test
	public void delete_rightValueHead() {
		list.add("a");
		list.add("b");
		assertTrue(list.delete("a"));
		assertEquals(1, list.size());
	}
	
	@Test
	public void delete_rightValueLeaf() {
		list.add("a");
		list.add("b");
		assertTrue(list.delete("b"));
		assertEquals(1, list.size());
	}
	
	@Test
	public void delete_rightValueMiddle() {
		list.add("a");
		list.add("b");
		list.add("c");
		assertTrue(list.delete("b"));
		assertEquals(2, list.size());
	}
	
	@Test
	public void delete_duplicates() {
		list.add("a");
		list.add("a");
		list.add("a");
		assertTrue(list.delete("a"));
		assertEquals(2, list.size());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void contains_nullInput() {
		list.contains(null);
	}
	
	@Test
	public void contains_notFound() {
		assertFalse(list.contains("a"));
	}
	
	@Test
	public void contains_found() {
		list.add("a");
		assertTrue(list.contains("a"));
	}
	
	@Test
	public void contains_foundLeaf() {
		list.add("a");
		list.add("b");
		list.add("c");
		assertTrue(list.contains("c"));
	}
	
	@Test
	public void contains_foundHead() {
		list.add("a");
		list.add("b");
		list.add("c");
		assertTrue(list.contains("a"));
	}
	
	@Test
	public void contains_foundMiddle() {
		list.add("a");
		list.add("b");
		list.add("c");
		assertTrue(list.contains("b"));
	}

}
