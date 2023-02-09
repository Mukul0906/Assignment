package Core_Java.Week2Feb;

import java.util.Scanner;

public class Factorialnumber {
	 public static void main(String args[]){
		 int i,f; 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Number : "); 
		 int n= sc.nextInt();

		 f=1;
		 for(i=1;i<=n;i++){
		 f=f*i; 
		 System.out.println("Factorial of the number is : "+f);
		 }
	 	 }
		 } 
