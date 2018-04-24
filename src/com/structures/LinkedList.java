package com.structures;

public class LinkedList {

	Node headNode;

	static class Node {

		int data;
		Node next;

		// Constructor to create new node.
		// Next will be by default null
		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.headNode = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedList.headNode.next = second;
		second.next = third;

		linkedList.printList();
	}

	public void printList() {

		Node node = headNode;

		while (node != null) {

			System.out.print("|" + node.data + "|");

			if (node.next != null) {
				System.out.print(" --> ");
			}

			node = node.next;
		}
	}

	// Insert new node in list
	public void push(int newData) {

		// STEP 1 : Allocate the node
		// STEP 2 : Allocate the data
		// STEP 3 : Make next of new node as a head node
		// STEP 4 : Move the head point to new node

		Node newNode = new Node(newData);

		newNode.next = headNode;
		headNode = newNode;
	}
	
	public void insertNodeAfter() {
		
	}
}
