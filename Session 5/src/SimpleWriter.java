import java.io.*;

public class SimpleWriter {
    public static void main(String[] args) {

        PrintWriter outputFile;

        {
            try {
                outputFile = new PrintWriter("Names.txt");
                outputFile.println("Chris");
                outputFile.println("Peggy");
                outputFile.println("Jacob");
                outputFile.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}