package com.codercocoon.LinkedList;

import java.util.Scanner;

public class TestInsertDeleteANode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		InsertDeleteANode ll = new InsertDeleteANode();

		System.out.print("Enter the linked list size : ");
		int size = sc.nextInt();

		System.out.println("##### Insert at last of the linked list. #####");
		int tmp = size;
		System.out.println("Enter the linked list elements : ");
		while (tmp > 0) {
			head = ll.insertAtLast(head, sc.nextInt());
			tmp--;
		}
		ll.print(head);
		
		System.out.println("##### Insert at first of the linked list. #####");
		System.out.println("Enter the element to insert at first : ");
		head = ll.insertAtFirst(head, sc.nextInt());

		System.out.println("##### Insert at Nth position of the linked list. #####");
		System.out.println("Enter the element to insert and the position : ");
		head = ll.InsertNth(head, sc.nextInt(), sc.nextInt());

		System.out.println("##### Delete element from the linked list. #####");
		System.out.println("Enter the position to delete : ");
		head = ll.delete(head, sc.nextInt());
	}
}
