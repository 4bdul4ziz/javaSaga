
public class dump {
public static void main(String args[]) {
    Integer x = 5, y=10, z=5;
    Short a = 5;
    // Returns byte primitive data type
    System.out.println( x.byteValue() );
    // Returns double primitive data type
    System.out.println(x.doubleValue());
    // Returns long primitive data type
    System.out.println( x.longValue() );
    System.out.println(x.compareTo(3));
    System.out.println(x.compareTo(5));
    System.out.println(x.compareTo(8));
}
}