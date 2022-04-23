package org.add;

public class GreensTech {
	public void greensOmr(String city, int pincode) {
		System.out.println(city+"\t"+pincode);
		//System.out.println("Hai");
	}
	public void greensOmr( int pincode,String city) {
		System.out.println(pincode+"\t"+city);
	}
	public void greensOmr(int i) {
		System.out.println(i);
	}
	public void greensOmr(int i, float f) {
		System.out.println(i+"\n"+f);
	}

	public static void main(String[] args) {
		GreensTech a =new GreensTech();
		a.greensOmr("Erode", 638455);
		a.greensOmr(638455, "Erode");
		a.greensOmr(123445);
		a.greensOmr(123, 123.45f);
		
	}

}
