public class Break {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 3) {
//        System.out.println("Hi!!");
//        i++;
//        break;
//        int[] numbers = {10,20,30,40,50};
//        for (int i=0; i < numbers.length; i++){
//            if (numbers[i] == 30){
//                break;
//                //exit
//            }
//            System.out.println(numbers[i]);
        //switch statment
//        int i = 5;
//        switch(i) {
//            case 0:
//                System.out.println("Zero!");
//                break;
//            case 1:
//                System.out.println("One!");
//                break;
//            default:
//                System.out.println("WTH!!!");
//                break;
//        }
        //nested for loop
        for(int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(i + "," + j);
                break;
            }
            //so breaks out of the loop its actually in. Not all the loops.
        }



    }
}
