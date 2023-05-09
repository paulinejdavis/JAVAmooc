public class Returning {
    public static void main(String[] args) {
//        printAMessage();
//        int sum = add(5,4);
//        System.out.println(sum);
        String shouting = caps("Shout loud");
        System.out.println(shouting);

        int[] awesomeArray = gimmeArrayFromInt(3,7,1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
    }

    public static String caps(String s) {
        return s.toUpperCase();
    }

    public static int[] gimmeArrayFromInt(int a,int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }

}
//    public static void printAMessage() {
//        System.out.println("This is our first method!");

 //   }
//void - type of the value that is returned. It doesn't store anything
//    public static int add(int a, int b) {
//        System.out.println(a + b);
//        return a + b;
//    }


//}
