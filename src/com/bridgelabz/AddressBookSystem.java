package com.bridgelabz;
import java.util.Scanner;
public class AddressBookSystem {

	 String firstName;
	    String lastName;
	    String address;
	    String city;
	    String state;
	    long zip;
	    String phoneNumber;
	    String email;
	    void addPerson() {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("First Name :");
	    	this.firstName=scan.nextLine();
	    	System.out.println("Last Name :");
	    	this.lastName=scan.nextLine();
	    	System.out.println("Enter the address :");
	    	this.address=scan.nextLine();
	    	System.out.println("Enter city : ");
	    	this.city=scan.nextLine();
	    	System.out.println("Enter state : ");
	    	this.state=scan.nextLine();
	    	System.out.println("Enter zip : ");
	    	this.zip=scan.nextLong();
	    	System.out.println("Enter Phone Number : ");
	    	this.phoneNumber=scan.nextLine();
	    	System.out.println("Enter Email : ");
	    	this.email=scan.nextLine();
	    	
	    }
		public static void main(String[] args) {
			System.out.println("Welcome to Address Book Program ");
	        AddressBookSystem contact=new AddressBookSystem();
	        contact.addPerson();
	        }
	}
	
