package com.codercocoon.DoublyLinkedList;

/**
 * This class represents some operations about doubly linked lists, especially
 * how you can Insert at first, at last, at Nth position, and delete from Nth
 * position.
 * 
 * @author contact@codercocoon.com.
 *
 */
public class InsertDeleteANode {

	/**
	 * This method inserts element at first of the doubly linked list.
	 * 
	 * @param head
	 *            : head of the doubly linked list.
	 * @param _data
	 *            : the element to insert.
	 * @return
	 */
	public Node insertAtFirst(Node head, int _data) {
		Node node = new Node(_data);
		node.next = head;
		head.previous = node;

		print(node);
		return node;
	}

	/**
	 * This method inserts element at last of the doubly linked list.
	 * 
	 * @param head:
	 *            head of the doubly linked list.
	 * @param _data:
	 *            the element to insert.
	 * @return
	 */
	public Node insertAtLast(Node head, int _data) {
		if (head == null)
			head = new Node(_data);
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			Node node = new Node(_data);
			current.next = node;
			node.previous = current.next;
		}
		return head;
	}

	/**
	 * This method inserts element at the Nth position of the doubly linked
	 * list.
	 * 
	 * @param head:head
	 *            of the doubly linked list.
	 * @param data:the
	 *            element to insert.
	 * @param position:
	 *            the Nth position.
	 * @return
	 */
	Node InsertNth(Node head, int data, int position) {
		Node current = head;
		Node previous = null;

		int i = 1;
		while (i < position) {
			previous = current;
			current = current.next;
			i++;
		}

		Node node = new Node(data);
		node.next = current;
		node.previous = previous;
		current.previous = node;

		if (previous != null) {
			previous.next = node;
		}

		if (i == 1)
			head = node;

		print(head);
		return head;
	}

	/**
	 * This method deletes element at the Nth position from the doubly linked
	 * list.
	 * 
	 * @param head:head
	 *            of the doubly linked list.
	 * @param position:the
	 *            Nth position.
	 * @return
	 */
	public Node delete(Node head, int position) {
		Node current = head;
		Node previous = null;

		int i = 1;
		while (i < position) {
			previous = current;
			current = current.next;
			i++;
		}

		if (previous != null) {
			previous.next = current.next;
			if (current.next != null)
				current.next.previous = previous;
		} else {
			head = current.next;
			head.previous = null;
		}

		System.out.print("Output : ");
		print(head);
		return head;
	}

	/**
	 * This method prints the elements of a doubly linked list.
	 * 
	 * @param head:head
	 *            of the doubly linked list
	 */
	void print(Node head) {
		if (head == null)
			System.out.println(head);
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + (current.next != null ? "<" : "") + "->");
				current = current.next;
				System.out.print((current == null) ? "NULL" : "");
			}
			System.out.println();
		}
	}
}
