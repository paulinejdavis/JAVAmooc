public class StringToInt {

    public static void main(String[] args) {
        // String s = "102";
        //System.out.println(Integer.parseInt(s) + 4);

//        int n = Integer.parseInt("6");
//
//        System.out.println("3"+ 4);
//        System.out.println(n + 4);

        //int n = 8;

        //System.out.println(Integer.toString(n) + 4);
        String s = "age: 102";
        s = s.replaceAll("\\D+","");

        int n = Integer.parseInt(s);
        System.out.println(n + 2);
    };
}
