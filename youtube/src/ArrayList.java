
public class ArrayList {
    public static void main(String[] args) {
        // need to know the exact amount in an array
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Kiwi";
        fruits[2] = "Guava";
        System.out.println(fruits[2]);
        // arraylist can grow and shrink - more flexible
        java.util.ArrayList fruitList = new java.util.ArrayList();
        fruitList.add("Mango");
        fruitList.add("Strawberry");
        fruitList.add("Blueberries");
        fruitList.add("Canteloupe");

        fruitList.remove("Canteloupe");
//        fruitList.clear();
        fruitList.add("Canteloupe");
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);
    }
}
