import java.util.Scanner;
public class hptb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The system of first-degree equation with two variable ax + by = m and cx + dy = n");
		System.out.print("Enter a:");
		double a = in.nextDouble();
		System.out.print("Enter b:");
		double b = in.nextDouble();
		System.out.print("Enter m:");
		double m = in.nextDouble();
		System.out.print("Enter c:");
		double c = in.nextDouble();
		System.out.print("Enter d:");
		double d = in.nextDouble();
		System.out.print("Enter n:");
		double n = in.nextDouble();
		double A = a/c;
		double B = b/d;
		double C = m/n;
		double D = b - d*A;
		double E = m - n*A;
		if (A != B) {
			double y = E/D;
			double x = (m - b*y)/a;
			System.out.println("The solution is: x = " + x + ", y = " + y );
		} else {
			if (B == C) {
				System.out.println("This system has infinities solutions!");
			} else {
				System.out.println("No solution!");
			}
		}
	}

}
