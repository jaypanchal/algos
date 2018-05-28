package com.structures.list;

public class LinkedList {

	Node headNode;

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.headNode = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		linkedList.headNode.next = second;
		second.next = third;

		linkedList.printList();
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.headNode = new Node(1);
		Node second2 = new Node(2);
		Node third2 = new Node(3);
		Node fourth2 = new Node(4);
		

		linkedList2.headNode.next = second2;
		second2.next = third2;
		third2.next = fourth2;
		

		linkedList2.printList();
		
		SumNodeData.addUpNodeData(linkedList, linkedList2);
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
		
		System.out.println();
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
