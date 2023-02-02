package ControlStatement;

import java.util.Scanner;
// find sum of positie numbers
public class ScannerClass_WhileEg {
	public static void main(String[] args) {
		int sum =0;
		int number =0;
		
		//scanner class
		Scanner sc = new Scanner(System.in);	// take input from user
		System.out.println("Enter the numbers");
		
		while (true) { // add only positive numbers condition
			number = sc.nextInt();
			if(number<0)break;
			
			sum+=number; // sum = sum+number
		}
		System.out.println("sum is:"+sum);
		sc.close();
	}
}
