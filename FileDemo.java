import java.io.*;

// File Handling Example
public class FileDemo {

    public static void main(String[] args) {

        // -------- WRITE DATA --------
        try {
            // FileWriter (append mode)
            FileWriter fw = new FileWriter("student.txt", true);

            fw.write("1 RAUNAK raunakraj@gmail.com\n"); 
            fw.write("2 ARYA aryaraj@gmail.com\n"); 

            fw.close();

            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file!");
        }

        // -------- READ DATA --------
        try {
            // FileReader + BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            String line;

            System.out.println("\nReading File Data:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
        /*
        Author - RAUNAK
        */
    }
}