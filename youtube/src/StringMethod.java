public class StringMethod {
    public static void main(String[] args) {
        String name = "Billy Bobbie Joe";
        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last char: " + name.charAt(15));
        System.out.println("Substring: " + name.substring(10,13));
    }
}
