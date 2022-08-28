package org.singleinheritance;

public class Constructor {
	public Constructor () {
		this(300);
	}

	public Constructor(int id) {
		this("Mani",9626186200l);
		System.out.println(id);
	}

	public Constructor(String name, long phone) {

		System.out.println(name);
		System.out.println(phone);
		
}
	public static void main(String[] args) {
		Constructor s=new Constructor();
		
	}
}