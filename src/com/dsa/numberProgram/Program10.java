//Print all prime numbers between 1 to n
package com.dsa.numberProgram;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }

        sc.close();
	}

}
