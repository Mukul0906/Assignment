package ControlStatement;

import java.util.Scanner;

public class LeapYear_Indicator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int a=sc.nextInt();    //Initialize the number
        
        if(a%4==0){
        	System.out.println("Year "+a+ " is a leap year.");
        }
        else {        
        System.out.println("Year "+a+" is not a leap year.");
        sc.close();
	}
	}
	}
