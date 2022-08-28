package org.singleinheritance;

public class Employee2 extends Company {
	public void empid2() {
		System.out.println("3265");
	}
	public void empname2() {
		System.out.println("Seenivasan");
	}
public static void main(String[] args) {
	Employee2 e=new Employee2();
	e.empid();
	e.empname();
	e.comid();
	e.comname();
	e.empid2();
	e.empname2();
}
}
