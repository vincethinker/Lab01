import java.util.Scanner;
public class ptb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The second-degree equation with one variable ax^2 + bx + c = 0");
		System.out.print("Enter a:");
		double a = in.nextDouble();
		System.out.print("Enter b:");
		double b = in.nextDouble();
		System.out.print("Enter c:");
		double c = in.nextDouble();
		double A = b*b - 4*a*c;
		if (a != 0) {
			if (A > 0) {
				double x1 = (-b + Math.sqrt(A))/(2*a);
				double x2 = (-b - Math.sqrt(A))/(2*a);
				System.out.println("This equation has two solutions is: x = " + x1 + " or x = " + x2);
			} else if (A == 0) {
				double x3 = (-b)/(2*a);
				System.out.println("This equation has one solution is: x = " + x3);
			} else {
				System.out.println("No solution!");
			}
		} else {
			if (b != 0) {
				double x4 = -c/b;
				System.out.println("This equation has one solution is: x = " + x4);
			} else {
				if (c == 0) {
					System.out.println("This equation has infinities solutions!");
				} else {
					System.out.println("No solution!");
				}
			}
		}
	}

}
