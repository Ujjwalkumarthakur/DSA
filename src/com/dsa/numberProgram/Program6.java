//Count the number of digits in an integer
package com.dsa.numberProgram;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1302763;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		System.out.println( "Total count of Integer are "+count+".");

	}

}
