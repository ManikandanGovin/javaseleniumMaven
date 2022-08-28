package org.singleinheritance;

public class MethodOverloading {
	public void empdetails(String name) {
		System.out.println("name");
	}
	public void empdetails(String name,long phone,char block) {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(block);
	}
	public void empdetails(int age) {
		System.out.println(age);
	}
	public void empdetails(String email,String project) {
		System.out.println(email);
		System.out.println(project);
	}
	public static void main(String[] args) {
		MethodOverloading ml=new MethodOverloading();
		ml.empdetails("Manikandan");
		ml.empdetails("seenibvasan", 9685743215l, 'A');
		ml.empdetails("mani@123", "java");
	}
}
