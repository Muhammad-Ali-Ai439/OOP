
package shape;

class Shape {//Muhammad Ali 73051
    void area(int side) {
        int result = side * side;
        System.out.println("Area of square: " + result);//Muhammad Ali 73051
    }
    void area(int length, int width) {
        int result = length * width;
        System.out.println("Area of rectangle: " + result);//Muhammad Ali 73051
    }
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle: " + result);//Muhammad Ali 73051
    }
    public static void main(String[] args) {
        Shape obj = new Shape();//Muhammad Ali 73051
        obj.area(5);         
        obj.area(10, 4);      
        obj.area(3.5); //Muhammad Ali 73051
    }
}
