package com.DLL;

import java.util.Scanner;

public class DLLTester {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		DLLUtility d1= new DLLUtility();
		boolean exit=false;
		
		while(!exit) {
			System.out.println("1. Add a new node at the start :"
					+ "\n2. Add a new node at the end :"
					+ "\n3. Add a new node at specific position :"
					+ "\n4. Delete the first node :"
					+ "\n5. Delete the last node :"
					+ "\n6. Delete a node a specific location :"
					+ "\n7. Display the DLL :");
			
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the node :");
				int data=sc.nextInt();
				d1.addFirstDLL(data);
				System.out.println();
				System.out.println("New node added at the start :");
				break;
				
			case 2:
				System.out.println("Enter the node :");
				int data2 = sc.nextInt();
				d1.addLastDLL(data2);
				System.out.println();
				System.out.println("New node added at the last :");
				break;
				
			case 3:
				System.out.println("Enter the node and position to insert at :");
				int data3=sc.nextInt();
				int position = sc.nextInt();
				
				if(d1.addAtPositionDLL(data3,position)) {
				System.out.println("Node inserted at your location :");
				}
				else {
					System.out.println("Invalid position :");
				}
				break;
				
			case 4:
				if(d1.deleteFirstDll()) {
				System.out.println("Node deleted at the first :");
				}
				else {
					System.out.println("LL is empty : ");
				}
				break;
				
			case 5:
				if(d1.deleteLast()) {
					System.out.println("Node deleted at last :");
				}
				else {
					System.out.println("LL is empty :");
				}
				break;
				
			case 6:
				System.out.println("Enter position :");
				int position1 = sc.nextInt();
				if(d1.deleteAtPosition(position1)) {
					System.out.println("Deleted node at the specified location :");
					d1.displayDLL();
				}
				else {
					System.out.println("Invalid position :");
				}
				break;
			case 7:
				d1.displayDLL();
				

			default:
				break;
			}
			
		}
		
		

	}

}
