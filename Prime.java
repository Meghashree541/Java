package java6;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=a.nextInt();
	boolean isprime=true;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			isprime=false;
			break;
		}
	}
	if(isprime) 
		System.out.println(n+"\nEntered number is Prime.");
	else
		System.out.println(n+"\nEntered number is not a prime.");
 }
}
