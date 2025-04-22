//Check if a number is prime
package com.dsa.numberProgram;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime=true;
		
		int num=5;
		if(num<=1) {
			isprime=false;
		}
		else {
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					isprime =false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num+" is Prime Number.");
		}
		else {
			System.out.println(num+" is not Prime Number.");
		}

	}

}
