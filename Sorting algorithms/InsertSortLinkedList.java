package com.algo.linkedlist;

import java.util.Random;

public class InsertionSort extends SelectionSort{

	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	public static Node addNode(Node head, int data) {
		Node ret;
		if(head==null) {
			return ret=new Node(data);
		} else ret = head;
		while(head.next!=null) {
			head = head.next;
		}
		head.next = new Node(data);
		return ret;
	}
	
	public static void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println("");
	}
	
	public static void insertionSort(Node head) {
		if(head.next==null) return;
		Node start = head.next;
		Node preTar = head;
		while(start!=null) {
			Node pre = null;
			Node cur = head;
			while(cur!=start) {
				if(cur.data>start.data) {
					if(pre==null) {
						preTar.next = start.next;
						start.next = cur;
						head = start;
					}else{
						preTar.next = start.next;
						pre.next = start;
						start.next = cur;
					}
					break;
				}
				pre = cur;
				cur = cur.next;
			}
			if(start.data==cur.data) {
				preTar=preTar.next;
				start=start.next;
			} else {
				start = preTar.next;
			}
		}
		System.out.println("\nInsertion Sort:- ");
		printList(head);
	}
	public static void main(String[] args) {
		Node head = randomNum(8);

		System.out.println("Given number ");
		printList(head);
		
		insertionSort(head);
	}
	
	public static Node randomNum(int n) {
		Node head=null;
		
		Random rand = new Random();
		for(int i=0;i<n;i++) {
			head = addNode(head, rand.nextInt(5)+1);
		}
		return head;
	}
}

 
