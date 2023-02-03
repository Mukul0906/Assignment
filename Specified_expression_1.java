package Core_Java;

public class Specified_expression_1 {
	public static void main(String[] args) {
		// first expression
		int sol=(101+0)/3;
		System.out.println("Solution of expression (101+0)/3 : "+sol);
		
		// second expression
		double solu=3.0e-6*10000000.1;
		System.out.println("Solution of expression- 3.0e-6*10000000.1 : "+solu);
		
		// boolean expression
		boolean a1=true&&true;
		boolean a2=false&&true;
		boolean a3=(false && false) || (true && true);
		boolean a4=(false || false) && (true && true);
		
		
		System.out.println("Solution of expression- true && true -> "+ a1);
		System.out.println("Solution of expression- false && true -> "+ a2);
		System.out.println("Solution of expression- (false && false) || (true && true) -> "+ a3);
		System.out.println("Solution of expression- (false || false) && (true && true) -> "+ a4);
	}

}
