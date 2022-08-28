package org.singleinheritance;

public class sample2 extends Sample{
public sample2() {
	super(200);
System.out.println("Manikandan");
}
public sample2(int id) {
	super(400);
	System.out.println(id);
}
public static void main(String[] args) {
	sample2 s= new sample2();
	Sample s1=new Sample();
}
}
