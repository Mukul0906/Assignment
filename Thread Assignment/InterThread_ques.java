package Thread;

class Customer {
	double newbalance ;
	
	synchronized void deposit(double deposit) {
		double depo = newbalance + deposit;
		System.out.println("Balance after depositing "+deposit+" is :Rs."+depo);
}
	synchronized void withdraw(double withdraw) {
		double balance = newbalance - withdraw;
		System.out.println("Balance after withdrawing "+withdraw+" is :Rs."+balance);
	}
	}
class Thread_a extends Thread{
	Customer c;
	Thread_a(Customer c){
		this.c=c;
	}
	public void run() {
		c.withdraw(1000);
	}
}
class Thread_b extends Thread{
	Customer c;
	Thread_b(Customer c){
		this.c=c;
	}
	public void run() {
		c.deposit(2000);
	}
}
public class InterThread_ques {
	public static void main(String[] args) {
	Customer c =new Customer();
	
	Thread_a t1 = new Thread_a(c);
	Thread_b t2 =new Thread_b(c);
	 
	t1.start();
	t2.start();
	
	}	
}
