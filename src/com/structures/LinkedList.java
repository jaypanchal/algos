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
		
		LinkedList linkedList2 = new LinkedList();
		linkedList2.headNode = new Node(1);
		Node second2 = new Node(2);
		Node third2 = new Node(3);
		Node fourth2 = new Node(4);
		

		linkedList2.headNode.next = second2;
		second2.next = third2;
		third2.next = fourth2;
		

		linkedList2.printList();
		
		addUpNodeData(linkedList, linkedList2);
	}
	
	public static void addUpNodeData(LinkedList l1, LinkedList l2) {
		
		LinkedList l3 = new LinkedList();
		
		Node n1 = l1.headNode;
		Node n2 = l2.headNode;
		Node n3 = l3.headNode;
		Node prev = null;
		
		while (n1 != null && n2 != null) {
			
			Node _newNode = new Node(n1.data + n2.data);
			
			if(n3 == null) {
				l3.headNode = _newNode;
				n3 = l3.headNode;
				prev = n3;
			}else {
				prev.next = _newNode;
				prev = _newNode;
				n3 = _newNode;
			}
			
			n1 = n1.next;
			n2 = n2.next;
			
		}
		
		if(n1 != null || n2 != null) {
			
			Node _intermediate = null;
			
			if(n1 != null)
				_intermediate = n1;
			else
				_intermediate = n2;
			
			while (_intermediate != null) {
				Node _newNode = new Node(_intermediate.data);
				
				prev.next = _newNode;
				prev = prev.next;
				
				_intermediate = _intermediate.next;
			}
		}
		
		l3.printList();
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
