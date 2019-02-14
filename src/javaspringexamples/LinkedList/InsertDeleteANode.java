package javaspringexamples.LinkedList;

/**
 * This class represents some operations about linked lists, especially how you
 * can Insert at first, at last, at Nth position, and delete from Nth position.
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class InsertDeleteANode {

	/**
	 * This method inserts element at first of the linked list.
	 * 
	 * @param head
	 *            : head of the linked list.
	 * @param _data
	 *            : the element to insert.
	 * @return
	 */
	public Node insertAtFirst(Node head, int _data) {
		System.out.print("Input : ");
		print(head);

		Node node = new Node(_data);
		node.next = head;

		System.out.print("Output : ");
		print(node);
		return node;
	}

	/**
	 * This method inserts element at last of the linked list.
	 * 
	 * @param head:
	 *            head of the linked list.
	 * @param _data:
	 *            the element to insert.
	 * @return
	 */
	public Node insertAtLast(Node head, int _data) {
		// System.out.print("Input : ");
		// print(head);
		if (head == null)
			head = new Node(_data);
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			current.next = new Node(_data);
		}
		// System.out.print("Output : ");
		// print(head);
		return head;
	}

	/**
	 * This method inserts element at the Nth position of the linked list.
	 * 
	 * @param head:head
	 *            of the linked list.
	 * @param data:the
	 *            element to insert.
	 * @param position:
	 *            the Nth position.
	 * @return
	 */
	Node InsertNth(Node head, int data, int position) {
		System.out.print("Input : ");
		print(head);

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
		if (previous == null)
			head = node;
		else
			previous.next = node;

		System.out.print("Output : ");
		print(head);
		return head;
	}

	/**
	 * This method deletes element at the Nth position from the linked list.
	 * 
	 * @param head:head
	 *            of the linked list.
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
		if (previous != null)
			previous.next = current.next;
		else
			head = current.next;

		System.out.print("Output : ");
		print(head);
		return head;
	}

	/**
	 * This method prints the elements of a linked list.
	 * 
	 * @param head:head
	 *            of the linked list
	 */
	void print(Node head) {
		if (head == null)
			System.out.println(head);
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + "->");
				current = current.next;
				System.out.print((current == null) ? "NULL" : "");
			}
			System.out.println();
		}
	}
}
