package testingEclipse;
import java.util.*;

class GreetName {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String firstName = sc.nextLine();
			String lastName = sc.nextLine();
			System.out.print("Hello, "+firstName+" "+lastName);
		}
	}
}