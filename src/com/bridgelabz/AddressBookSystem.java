package com.bridgelabz;

public class AddressBookSystem {

	String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    String phoneNumber;
    String email;
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
        AddressBookSystem contact=new AddressBookSystem();
        contact.firstName="Neha";
        contact.lastName="Chougule";
        contact.address="Jain Mandir burli";
        contact.city="Sangli";
        contact.state="Maharashtra";
        contact.zip=416308;
        contact.phoneNumber="9856342312";
        contact.email="neha123@gmail.com";
        
        }
	}

