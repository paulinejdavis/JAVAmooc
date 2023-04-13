public class BooleanInJava {

    public static void main(String[] args) {
        /** int a = 0;
        //boolean b = true;
        boolean b = a == 0;
        if(true) {
            System.out.println("We are in the if statement!");**/
        boolean passedDoor = true;
        //boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if(passedDoor) {
            System.out.println("We passed the first door!");
            doorCount = doorCount + 1;
        }
        if(passedDoor) {
            System.out.println("We passed the second door!");
            doorCount = doorCount + 1;
        }
        if(passedDoor) {
            System.out.println("We passed the third door!");
            doorCount = doorCount + 1;
        }
        if(doorCount == 3){
            passedAllDoors = true;

        }
        if(passedAllDoors) {
            System.out.println("Congrats!");
        }
    }
}
