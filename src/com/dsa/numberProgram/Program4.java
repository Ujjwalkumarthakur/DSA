//Find the smallest of three numbers
package com.dsa.numberProgram;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11,b=12,c=3;
		int smallest=0;
		if(a<b && a<c) {
			smallest=a;
		}
		else if(b<a && b<c) {
			smallest=b;
		}
		else {
			smallest=c;
		}
		System.out.println(smallest+" is the Smallest Number in among three.");

	}

}
