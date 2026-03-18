
package calculator;//Muhammad Ali 73051

class Calculator {

   void sum() {//Muhammad Ali 73051
        int a, b, c;
        a = 5;
        b = 6;
        c = a + b;
        System.out.println("the result is " + c);//Muhammad Ali 73051
    }
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("the result is " + c);//Muhammad Ali 73051
    }
    void sum(float a, int b) {
        double c = a + b;
        System.out.println("the result is " + c);//Muhammad Ali 73051
    }
    void sum(int a, int b, int c) {
        int res = a + b + c;
        System.out.println("the result is " + res);//Muhammad Ali 73051
    }
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;
        Calculator obj = new Calculator();//Muhammad Ali 73051
        obj.sum(a, b, c);
        obj.sum(2.5f, 5);
        obj.sum(a, b);
    }
}
