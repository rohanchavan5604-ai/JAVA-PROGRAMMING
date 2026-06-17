package com.ClassWorkJM;

import Oops_JM.AccessModifire;

public class Accessdemo {
	
	public static void main(String[] args) {
		
		AccessModifire r5 = new AccessModifire();
		System.out.println("Outside Package: "+r5.p);
		
		DiffPackSubClass ob3 = new DiffPackSubClass();
		ob3.display();
		
	}
	
}
class DiffPackSubClass extends AccessModifire
{

	void display() {
		
		System.out.println("Parent Ouside package: "+p);
	}
}