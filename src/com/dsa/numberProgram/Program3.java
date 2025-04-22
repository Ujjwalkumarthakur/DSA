//Find the largest of three numbers
package com.dsa.numberProgram;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=21,b=12,c=3;
		int largest=0;
		if(a>b && a>c) {
			largest=a;
		}
		else if(b>c && b>a) {
			largest=b;
		}
		else {
			largest=c;
		}
		System.out.println(largest+" is the Largest Number among the three.");

	}

}
