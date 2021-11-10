package com.exception;

public class Array_List implements List_demo {

	public Array_List() {

		//System.out.println("non parameterized constructor");
		
	}

	
	public void get() {

		System.out.println("get");

	}

	public void add() {

		System.out.println("add");

	}

	public static void main(String[] args) {

		Array_List list = new Array_List(); // default constructor
		
		List_demo demo = new Array_List(); // ----> up casting

	}


	public void get(String add) {
		// TODO Auto-generated method stub
		
	}

}
