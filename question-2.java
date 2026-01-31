class AreaCalculator {

    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area of Square: " + obj.area(5.0));
        System.out.println("Area of Rectangle: " + obj.area(4.0, 6.0));
        System.out.println("Area of Circle: " + obj.area(3));
    }
}
/*Area of Square: 25.0
Area of Rectangle: 24.0
Area of Circle: 28.26
*/