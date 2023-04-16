import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
        float average;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = num.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = num.nextInt();
            sum = sum + a[i];
        }
        Arrays.sort(a);
        System.out.println("Sort array: "+Arrays.toString(a));
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
	}

}
