
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        //http://www.textfiles.com/100/captmidn.txt

        File file = new File("/Users/paulinejdavis/Desktop/text.txt");
        Scanner scan = new Scanner(file);
            System.out.println(scan.nextLine());

    }
}
