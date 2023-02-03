package Core_Java;

import java.util.Scanner;

public class Test_ques_3 {
	public static void main(String[] args) {
		int a;
		int b; 
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");  
		a = sc.nextInt();  
		
		System.out.println("Enter the second integer: ");  
		b = sc.nextInt(); 
		
		 if (a>b)  {
			System.out.print("The maximum integer is : "+a);
		} else {
			System.out.print("The minimum integer is : "+a);
			
		System.out.println();
		 if (b>a) {
			System.out.println("The maximum integer is : "+b);
		}else {
			System.out.println("The minimum integer is : "+b); 
		}
	}
}}
