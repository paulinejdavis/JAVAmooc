public class NestedForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("it's cold");

        }
        System.out.println("-----------");
        String[] colors = {"Red", "Gold", "Green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);

        }

        System.out.println("-----------");
        String[][] fancyColors = {{"Red", "Gold", "Green"},
                {"Cyan", "Magenta", "Turquoise"}
        };
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(fancyColors[row][column]);

            }
        }
        System.out.println("-----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }

}



//nested for loops to get elements from a 2d array

