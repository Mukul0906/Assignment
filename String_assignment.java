package String;

import java.util.StringTokenizer;

//  	Write a program which creates a String “Welcome to Java World” and performs the following 
public class String_assignment {
	
	public static void show() {
		System.out.println("Problem statement 1");
		System.out.println();
		String str ="Welcome to Java World";
		String x = "Welcome";
		
		System.out.println("Original String :" +str);		
	// Returns the character at 5th position and display it.
		System.out.println("Char at 5th pos: "+str.charAt(5-1));
	// Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
		System.out.println("After comparing");
		if (str.compareToIgnoreCase(x)>0) {
			System.out.println("Equal string");
		}
		else {
			System.out.println("Unequal string");
		}
		System.out.println("Characters difference between two string is :"+str.compareToIgnoreCase(x));
	// Concatenates “- Let us learn” to the above string and display it.	
		String newstr=str.concat(" Let us learn");
		System.out.println("After concatenates  string is : "+newstr);
	// Returns the position of the first occurrence of character ‘a’ and display it.
		System.out.println("First occurance of a is at position "+str.indexOf('a'));
	// Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
		System.out.println("After replacing a with e :"+str.replace('a', 'e'));
	// Returns string between 4th position and 10th position and display it.
		System.out.println("string bw 4th and 10th pos : "+str.substring(4, 10));
	// Returns the lowercase of the string and display it.
		System.out.println("Lower case string: "+str.toLowerCase());	
		
		System.out.println();
	}
	public static void print() {
		System.out.println("Problem Statement 2");
		System.out.println();
		
		StringBuffer s = new StringBuffer("This is StringBuffer"); 
		System.out.println("Original String : "+s);
	//	Adds the string ”- This is a sample program” to existing string and display it.
		s.append("- This is a sample program");
		System.out.println("After adding : "+s);
	//	Inserts the string “Object” into the existing string at 21st position and display it.
		s.insert(21, "Object");
		System.out.println("After inserting object at 21 pos: "+s);
	//  Replaces the word “Buffer” with “Builder” and display it.
		s.replace(14, 20, "Builder");
		System.out.println("After replacing buffer with builder : "+s);
	//  Reverses the entire string and displays it.	
		s.reverse();
		System.out.println("after reversing string : "+s);
		
		System.out.println();
	}
	public static void display() {
		System.out.println("Problem statement 3 ");
		System.out.println();
		
		StringTokenizer st = new StringTokenizer ("C:\\IBM||DB2||PROGRAM\\DB2COPY1.EXE");
		System.out.println("Original Statement : "+st);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("\\"));
		}
	}
	public static void main(String[] args) {
		show();
		print();
		display();
	}
}
