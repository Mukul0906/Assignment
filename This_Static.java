package Core_Java.Week2Feb;

class This_Static1 {
		//instance variable
		int Id;
		String Ename;
		double salary;
		static String company="Dassault Systems";
		static String department="Quality";
		// static void method to change the value of static variable
		static void change() { // static method
			department="Inventory"; }
			
	// parameterized constructor
		This_Static1(int Id, String Ename, double salary){ // parameterized constructor
		this.Id=Id;
		this.Ename=Ename;
		this.salary=salary;
	}
	// user defined method
	void result() {
		System.out.println(company+" "+department+" "+Id+" "+Ename+" "+salary);
	}
	public class This_Static {
		public static void main(String[] args) {
			// calling static method with class name
			// no need to create object for static method
			This_Static1.change();
		// creating object
		This_Static1 s1=new This_Static1(1009,"Mukul",35000);
		This_Static1 s2=new This_Static1(1010,"Arvind",35000);
		This_Static1 s3=new This_Static1(1030,"Saurav",35000);
		s1.result();
		s2.result();
		s3.result();
		}
	}
	}
