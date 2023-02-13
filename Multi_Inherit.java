package LabC;
class Car{
	String Brand="Mahindara & Mahinddra";
	String Model="THAR";
}
class Price extends Car{
	int prex=1000000;	
}
class Car1 extends Price{
	int tax=(prex*25)/100;
	int acc=50000;
}
public class Multi_Inherit {
	public static void main(String[] args) {
		Car1 sh= new Car1();
		System.out.println("Vehicle Brand : "+sh.Brand+"  Model : "+sh.Model);
		System.out.println("Ex Showroom Price : Rs."+sh.prex);
		System.out.println("Total price : Rs."+(sh.prex+sh.tax+sh.acc));
	}
	

}
