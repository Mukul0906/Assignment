package Lab_2feb;

public class Ex_Default_Parameter {
	int pincode;
	String area;
	Ex_Default_Parameter(int a, String x) {
		pincode=a;
		area=x;
	}	
	Ex_Default_Parameter(){
		
	}
	void show() {
		System.out.println(pincode+" "+area); }
	public static void main(String[] args) {

		Ex_Default_Parameter d =new Ex_Default_Parameter(91, "India");
		Ex_Default_Parameter d1 =new Ex_Default_Parameter(1, "USA");
		Ex_Default_Parameter dc= new Ex_Default_Parameter(); // default parameter object
		dc.area="China";
		dc.pincode=86;
			d.show();	
			d1.show();
			dc.show();
	}	
	
	}

