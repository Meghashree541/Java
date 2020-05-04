package java2;
import java.util.Scanner;
public class Conversion {
	public static void main(String[]args) {
		double minsinyear=365*24*60;
		Scanner a=new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		double min=a.nextDouble();
		long years=(long)(min/minsinyear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+" minutes is approximately "+years+" years and "+days+" days");

}
}
