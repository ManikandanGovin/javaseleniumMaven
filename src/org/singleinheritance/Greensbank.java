package org.singleinheritance;

public class Greensbank extends Methodoverriding {
@Override
	public void deposit() {
	super.deposit();
		System.out.println("3%");
	}
public static void main(String[] args) {
	Greensbank g=new Greensbank();
	g.saving();
	g.deposit();
}











}
