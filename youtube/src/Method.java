public class Method {
    public static void main(String[] args) {
        welcome();
        multiply(5, 100);
        multiply(2, 3);
        multiply(6, 8);
        divide(2, 2);
        divide(100,10);
        divide (66,11);
        divide(20,5);
//        int a = 5;
//        int b = 10;
//        System.out.println(a * b);
//
//        int c = 2;
//        int d = 3;
//        System.out.println(c * d);
//
//        int e = 9;
//        int f = 3;
//        System.out.println(e * f);
        //above is repetitive use a method
    }
    public static void welcome() {
        System.out.println("Welcome to the Calculator!");
    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide (int a, int b) {
        System.out.println(a / b);

    }
}
