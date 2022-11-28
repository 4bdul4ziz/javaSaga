package inputSesh;
import java.util.*;

public class inputs {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
    	int iinput = sc.nextInt();
        System.out.println("Enter double: ");
		double dinput = sc.nextDouble();	
        System.out.println("Enter string: ");
        String sinput = sc.next();
        System.out.println("Integer: " + iinput);
        System.out.println("Double: " + dinput);
        System.out.println("String: " + sinput);
        
	}
}
