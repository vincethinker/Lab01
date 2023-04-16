import java.util.Scanner;
public class ptb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first-degree equation with one variable ax + b = 0");
		System.out.print("Enter a:");
		double a = in.nextDouble();
		System.out.print("Enter b:");
		double b = in.nextDouble();
		if (a != 0) {
			double x = -b / a;
			System.out.println("The solution is: x = " +x);
		} else {
			if (b == 0) {
				System.out.println("This equation has infinities solutions!");
			} else {
				System.out.println("No solution!");
			}
		}
	}

}
