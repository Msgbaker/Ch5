import java.util.Scanner;

public class Quadratic{
	public static void main(String[] arg){
		Scanner in= new Scanner(System.in);
		System.out.print("Insert numbers of polynomial to factor: a=");
		double a=in.nextDouble();
		System.out.print("b=");
		double b=in.nextDouble();
		System.out.print("c=");
		double c=in.nextDouble();
		quad(a,b,c);
		System.out.print(a+" "+b+" "+c);
	}
	
	public static void quad(double a, double b, double c){
		if(Math.pow(b,2) - (4 * a * c)>0 && b!=0 && c!=0 && a!=0){
			double ans1=(-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
			double ans2=(-b - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2 * a);
			System.out.println(ans1 + " and " + ans2);
		}else System.out.println("Can't use quadratic formula -_-");
	}
}

