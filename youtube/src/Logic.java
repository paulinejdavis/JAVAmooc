public class Logic {

    public static void main(String[] args) {

        // || or
        // && and
        //! not

        //boolean a = true || false;
        //boolean a = true && false;
        //boolean a = !true;
        int a = 3;
        int b = 4;
        //boolean c = !((a > b) && true);
        boolean isSunny = false;
        boolean amHappy = false;

        if ((a < b && isSunny) || amHappy) {
            System.out.println("it's gonna be a good day");
        }

            //System.out.println(c);
    }
}
