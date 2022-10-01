package com.cts.demo.devtools.springdemo.dsa;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	//to count elements
	public int length() {
		if (head==null) {
			return 0;
		}
		ListNode current =head;
		int count=0;
		while (current!=null) {
			count++;
			current=current.next;
		}
		return count;
		
	}

	public void insertFirst( int value) {
		ListNode newNode= new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	
	public void insertLast(int value) {
		ListNode newNode= new ListNode(value);
		if (head ==null) {
			head =newNode;
			return ;
		}
		ListNode current =head;
		while(null != current.next)
		{
			current=current.next;
			
		}
		current.next=newNode;
	}
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();// initialize the sll

		// head=null
		/*
		 * sll.head = new ListNode(10); ListNode second = new ListNode(1); ListNode
		 * third = new ListNode(8); ListNode fourth = new ListNode(7); // connect them
		 * together to create sll
		 * 
		 * sll.head.next = second;// 1 second.next = third;// 8 third.next = fourth;// 7
		 */
		
		//insert first
//		sll.insertFirst(11);
//		sll.insertFirst(1);
//		sll.insertFirst(2);
//		
		
		
		//insert last
		sll.insertLast(22);
		sll.display();
		
		//System.out.println(" length is - " +sll.length());

	}

}
