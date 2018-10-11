package com.algo.linkedlist;

public class QuickSortLinkedList extends InsertionSort{
	static int i=0;

	static Node headPtr=null, backPivot=null;
	
	public static Node pivot(Node head ){
		while(head.next!=null) {
			head = head.next;
		}
		return head;
	}
	
	public static Node partition(Node head) {
		if(head==null || head.next==null) 
			return head;

		headPtr=null;backPivot=null;
		Node index=head.next, ptr=head, pivot=head;
		
		while(index!=null) {
			if(pivot.data>=index.data) {
				if(headPtr==null) {
					headPtr = index;
					backPivot = index;
					ptr.next = index.next;
					index.next = pivot;
				} else{
					ptr.next = index.next;
					index.next = headPtr;
					headPtr = index;
				}
				index = ptr.next;
			} else{
				ptr = index;
				index = index.next;
			}
		}

		return pivot;
	}
	public static Node quickSort(Node head) {
		if(head==null || head.next == null) return head; 
		Node pivot = partition(head);

		Node headPtr1=headPtr, backPivot1=backPivot, nextPivot1=pivot.next;

		if(backPivot1!=null)
			backPivot1.next=null;
		
		pivot.next = null;
		Node left = quickSort(headPtr1);
		
		
		
		Node right = quickSort(nextPivot1);
		
		if(left!=null) {
			Node temp=left;
			while(left.next!=null) {
				left=left.next;
			}
			left.next=pivot;
			pivot.next=right;
			return temp;
		} else if(right!=null){
			pivot.next=right;
			return pivot;
		} else return pivot;
		
	}
	
	
	public static void main(String[] args) {
		Node head = randomNum(6);
		System.out.println("Given List");
		printList(head);
		
		head = quickSort(head);
		System.out.println("QuickSort List");
		printList(head);
	}

}
