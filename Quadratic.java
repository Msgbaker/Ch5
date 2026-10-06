import java.util.Scanner;

public class Quadratic{
	public static void main(String[] arg){
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		quad((double)a,(double)b,(double)c);
	}
	
	public static void quad(double a, double b, double c){
		if(Math.pow(b,2) - (4 * a * c)>0 && b>0 && c>0 && a>0){
			double ans1=(-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/2 * a;
			double ans2=(-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/2 * a;
			System.out.println(ans1 + " and " + ans2);
		}
	}
}
