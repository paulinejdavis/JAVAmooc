public class Exceptions {
    public static void main(String[] args) {
        String[] pets = {"monkey", "tiger", "baboon"};
        System.out.println(pets[4]);
    }
}

/* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
 at Exceptions.main(Exceptions.java:4)
just a note on reading the exceptions on java which clearly explains
what the issues are and where the problem is */
