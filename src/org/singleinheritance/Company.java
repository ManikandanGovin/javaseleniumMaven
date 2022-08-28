package org.singleinheritance;

public class Company extends Employee {
	public void comid() {
		System.out.println("231654");

	}
	public void comname() {
		System.out.println("Elger");

	}
	public static void main(String[] args) {
		Company c=new Company();
		c.comid();
		c.comname();
		c.empid();
		c.empname();
	}
}
