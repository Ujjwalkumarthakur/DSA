//Check if a number is palindrome
package com.dsa.numberProgram;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int original=num;
		int reverse=0;
		while(num!=0) {
			int n=num%10;
			reverse=reverse*10+n;
			num=num/10;
		}
		if(original == reverse) {
			System.out.println(original +" is a Palindrome Number.");
		}
		else {
			System.out.println(original +" is not a Palindrome Number.");
		}

	}

}
