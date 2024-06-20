package com.DLL;

public class DLLUtility {
	private Node head;
	public DLLUtility() {
		this.head=null;
	}
	
	public Node getHead() {
		return head;
	}
	

	public boolean addFirstDLL(int data) {
		Node n1=new Node(data);
		
		if(head==null) {
			head=n1;
			return true;
		}
		
		else {
				n1.setNext(head);
				head=n1;
		}
		
		return true;
	}

	public void displayDLL() {
		if(head==null) {
			System.out.println("Linked List is empty :");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
			
		}
		System.out.println();
	}

	public boolean addLastDLL(int data2) {
		Node n1 = new Node(data2);
		Node trav=head;
		
		if(head==null) {
			head=n1;
			return true;
		}
		
		while(trav.getNext()!=null) {
			trav=trav.getNext();
		}
		trav.setNext(n1);
		n1.setPrev(trav);
		return true;
	}

	public boolean addAtPositionDLL(int data3, int position) {

		if(position == 1) {
			addFirstDLL(data3);
			return true;
		}
		
		
			Node n1=new Node(data3);
			Node trav = head;
			for(int i =1 ; i < position -1 ; i++) {
				if( trav == null  || trav.getNext()==null ) {
					
					return false;
				}
				trav=trav.getNext();
			}
			Node Next = trav.getNext();
			n1.setPrev(trav);
			n1.setNext(Next);
			trav.setNext(n1);
			  if (Next != null) {
			        Next.setPrev(n1);
			    }
		
		return true;
	}

	public boolean deleteFirstDll() {
		if(head == null) {
			return false;
		}
		
		if(head.getNext()==null) {
			head = null;
			return true;
		}
		
		head=head.getNext();
		head.setPrev(null);
		return true;
		
	}

	public boolean deleteLast() {
		if(head==null) {
			return false;
		}
		
		if(head.getNext()==null) {
			head=null;
			return true;
		}
		Node trav=head;
		while(trav.getNext().getNext()!=null) {
			trav=trav.getNext();
		}
		trav.setNext(null);
		return true;
		
	}

	public boolean deleteAtPosition(int position) {
		if(head == null) {
			return false;
		}
		
		if(position == 1 && head.getNext()==null) {
			head = head.getNext();
			return true;
		}
		
		if(position == 1 && head.getNext()!=null) {
			deleteFirstDll();
		}
		Node trav = head;
		for(int i = 1;i<position - 1;i++) {
			if(trav == null || trav.getNext()==null ) {
				return false;
			}
			trav=trav.getNext();
		}
		
		Node nextT = trav.getNext();
		if(nextT == null)
		{
			return false;
		}
		trav.setNext(nextT.getNext());
		
		return true;
		
	}
	
	

}
