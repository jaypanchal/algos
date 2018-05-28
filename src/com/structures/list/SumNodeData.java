package com.structures.list;

public class SumNodeData {
	public static void addUpNodeData(LinkedList l1, LinkedList l2) {

		LinkedList l3 = new LinkedList();

		Node n1 = l1.headNode;
		Node n2 = l2.headNode;
		Node n3 = l3.headNode;
		Node prev = null;

		while (n1 != null && n2 != null) {

			Node _newNode = new Node(n1.data + n2.data);

			if (n3 == null) {
				l3.headNode = _newNode;
				n3 = l3.headNode;
				prev = n3;
			} else {
				prev.next = _newNode;
				prev = _newNode;
				n3 = _newNode;
			}

			n1 = n1.next;
			n2 = n2.next;

		}

		if (n1 != null || n2 != null) {

			Node _intermediate = null;

			if (n1 != null)
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
}
