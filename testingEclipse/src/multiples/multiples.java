package multiples;
import java.util.*;

public class multiples {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int inp = sc.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.print(i*inp+"\n");
		}
	}
}
