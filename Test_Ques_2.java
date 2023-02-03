package Core_Java;

import java.util.Scanner;

public class Test_Ques_2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter number of minutes : ");
		int min;
		min=s.nextInt();
		int year,days;
		int yr=60*24*365; //logic for minutes in year
		year=min/yr; // for year 
		System.out.println("Number of years : "+year);
		
		// logic for number of aysdays 
		min=min-(year*yr);
		int day=60*24;
		days=min/day;
		System.out.print("Number of days : "+days);
	}

}
