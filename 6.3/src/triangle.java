import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hay nhap gia tri n ban muon: ");
		int n = keyboard.nextInt();
		int i,j;
		for(i = 0;i < n;i++) {
			for(j = n-i;j > 1;j--) {
				System.out.print(" ");
			} for(j = 0;j <= 2*i;j++) {
				System.out.print("*");
			} System.out.println();
		}
	}

}