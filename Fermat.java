public class Fermat{
	public static void main(String[] arg){
		System.out.println(fermatTest(2,2,2,4));
	}
	public static String fermatTest(double a, double b, double c, double n){
		if(Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n))return "Fermat doesn't know ball";else return "Fermat very iq";
	}
}
