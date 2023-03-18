package March_3rd_week;

import java.util.regex.Pattern;
//  meta character
// 		\\d - [0-9]
// 		\\s - write space character
// 		\\w - [a-zA-Z0-9]

public class Meta_character {
public static void main(String[] args) {
	
	boolean a = Pattern.matches("\\w{5,}", "Anudip123"); // 
	System.out.println(a);
	boolean b = Pattern.matches("\\w\\d{5,}", "Mukul Kumar");
	System.out.println(b);
}
}
