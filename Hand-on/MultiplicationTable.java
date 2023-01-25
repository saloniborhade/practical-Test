//Write a Program to print any multiplication table. 
//Use Exception handling and call Thread.Sleep method.
package corejava1;
import java.util.Scanner;

public class MultiplicationTable extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		try {
			for(int i=1;i<=10;i++) {
				
				//it will sleeps the main method thread for 1 second
				//each time the for loop runs
				Thread.sleep(1000);  
				//Printing the values of the variables
				System.out.println(n*i);
			}
		}
		catch(Exception e) {
			//Catching the exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		MultiplicationTable m=new MultiplicationTable();
		m.start();

	}

}