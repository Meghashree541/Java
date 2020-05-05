package java3;
import java.util.Scanner;

public class Switch {
	public static void main(String[]args){
		int choice;
		System.out.println("Pick any one");
		System.out.println("1.Hi\t 2.Hey\t 3.Hello\t");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{ 
			case 1: System.out.println("You said Hi!");
					break;
			case 2: System.out.println("You said Hey!");
					break;
			case 3: System.out.println("You said Hello!");
					break;
			default:System.out.println("Invalid Choice");
			
		}
	}
}
