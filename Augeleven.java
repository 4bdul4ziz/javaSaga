/*
 * will take one input, it can also take two inputs, if only one input is taken then area of circle is computed, if two inputs are taken then if both the parameters values are same, then square area is computed, if the two inputs are different then we calculate the area of rectangle, use method overloading for square and rectangle. The method name should be area for both
 */

class Augeleven {
    void area(int r) {
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }

    void area(int r, int s) {
        if (r == s) {
            double area = r * r;
            System.out.println("Area of square is: " + area);
        } else {
            double area = r * s;
            System.out.println("Area of rectangle is: " + area);
        }
    }
    public static void main (String[] args) {
        Augeleven augeleven = new Augeleven();
        augeleven.area(5);
        augeleven.area(5, 5);
        augeleven.area(5, 7);
    }
}
