import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "textfilename.txt";
      
        FileWriter writer = new FileWriter(fileName);
        writer.write("This is the original text.");
        writer.close();
      
        Scanner reader = new Scanner(new File(fileName));
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();

        reader = new Scanner(new File(fileName));
        String content = "";
        while (reader.hasNextLine()) {
            content += reader.nextLine() + "\n";
        }
        reader.close();

        content = content.replace("original", "modified");

        writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
      
        reader = new Scanner(new File(fileName));
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
