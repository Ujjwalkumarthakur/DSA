//Find the sum of digits of a number
package com.dsa.numberProgram;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int sum=0;
		while(num!=0) {
			int j=0;
			j=num%10;
			sum=sum+j;
			num=num/10;
		}
		System.out.println("Sum of the digit of the given Number is "+sum+".");

	}

}
