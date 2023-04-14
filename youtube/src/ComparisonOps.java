public class ComparisonOps {

    public static void main(String[] args) {
       /** int a = 5;
        int b = 4;**/
        // == is equal to
        //<= less than or equal to
        //>= greater than or equal to
        //< less than
        //> greater than
        // = assign a variable
        //boolean c = (a >= b);
        //|| or

        double a = 2.4;

        if(a == 2.4) {
            System.out.println("They are equal");
        }
        if(a > 7) {
            System.out.println("Greater than 7");
        }
        //a == 2.4 || a == 2.5 || a == 5.1
        if(true || false) {
            System.out.println("a == 2.4 or a == 2.5");
        }
        if(a >= 0 && a <= 100) {
            System.out.println("a is in the range");
        }

    }
}