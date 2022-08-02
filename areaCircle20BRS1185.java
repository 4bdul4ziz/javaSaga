//Write a Java program to prompt the user to enter the area of a circle and display the radius and perimeter of the circle.

public class areaCircle20BRS1185 {
    public static void main(String[] args) {
        System.out.println("Enter the area of the circle: ");
        String area = System.console().readLine();
        double areaDouble = Double.parseDouble(area);
        double radius = Math.sqrt(areaDouble / Math.PI);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The radius of the circle is " + radius + " and the perimeter is " + perimeter);
    }
}