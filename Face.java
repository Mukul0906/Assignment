package Core_Java.Week2Feb;

import java.util.Scanner;

public class Face {
	public static void main(String[] args) {
		
// creating scanner class
	Scanner sc=new Scanner(System.in);
	System.out.println("Type anyone from 1,2,3,4 : ");
	int n=sc.nextInt();
	
	 if (n ==1) {
		 System.out.println(" [| o o |] ");
		 System.out.println("  |  ^  |  ");
		 }
		  else if (n ==2) { 
		 System.out.println(" |'-'| ");
		 }
		 else if (n ==3) {
		 System.out.println("(*^o^*)");
		 }
		 else if (n ==4) {
			 System.out.println("(^.^)");
			 }
		 else if (n>4) {
		 System.out.println("error");
		 System.out.println("choose from 1,2,3,4.");
		 }
	}
}
