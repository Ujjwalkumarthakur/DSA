//Reverse a number
package com.dsa.numberProgram;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int reverse=0;
		while(num!=0) {
			int n=num%10;
			reverse=reverse*10+n;
			num=num/10;
		}
		System.out.println(reverse+" is the Reverse Number.");

	}

}
