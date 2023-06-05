package File;
import java.io.*;

public class file1 {
    public static void main(String a[]) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "myfile.txt";
            FileWriter fw = new FileWriter(filename, false);
            // appends the string to the file
            fw.write("Python Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
            // read the file content
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}