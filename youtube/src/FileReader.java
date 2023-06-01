
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {
    public static void main(String[] args) throws IOException {
        //http://www.textfiles.com/100/captmidn.txt

        File file = new File("/Users/paulinejdavis/Desktop/text.txt");
        Scanner scan = new Scanner(file);
        //System.out.println(scan.nextLine());
        String fileContent = "THIS IS A BRAND NEW TEST. ";
        while(scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/Users/paulinejdavis/Desktop/newtext.txt");
        writer.write(fileContent);
        writer.close();

    }
}
