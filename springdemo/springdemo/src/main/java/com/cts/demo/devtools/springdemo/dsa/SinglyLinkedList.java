package com.cts.demo.devtools.springdemo.dsa;

public class SinglyLinkedList {

	/*private ListNode head; // instance variable of type list node

	private static class ListNode {// Listnode static class

		// two properties 1-data 2-pointer to next node

		private int data;
		// generic type
		private ListNode next;

		public ListNode(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		*/
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
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
		
		public static void main(String[] args) {
			SinglyLinkedList sll=new SinglyLinkedList();//initialize the sll
			
			//head=null
			sll.head=new ListNode(10);
			ListNode second=new ListNode(1);
			ListNode third =new ListNode(8);
			ListNode fourth =new ListNode(7);
			//connect them together to create sll
			
			sll.head.next=second;//1
			second.next=third;//8
			third.next=fourth;//7
			

			sll.display();
			
			/*System.out.println(sll);
			ListNode current=sll.head;
			while(current!=null) {
				System.out.print(current.data +" -->");
				current= current.next;
			}
			System.out.println("null");*/
		}
		

	}


