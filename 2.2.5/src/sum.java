import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        double a = in.nextDouble();
        System.out.print("Input 2nd number: ");
        double b = in.nextDouble();
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Product: " +product);
        System.out.println("Quotient: " +quotient);
	}

}
