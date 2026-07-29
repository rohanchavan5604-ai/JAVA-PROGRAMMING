package Exeption_Handling_JM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Hello2 {

    // Read data from file
    void display() throws FileNotFoundException, IOException, Exception {

        FileReader fr = new FileReader("../java_practicle/src/Exeption_Handling_JM/Rohan.txt");
        BufferedReader br = new BufferedReader(fr);

        String content;

        System.out.println("----- File Content -----");

        while ((content = br.readLine()) != null) {
            System.out.println(content);
        }

        br.close();
    }

    // Write data into file
    void writecode() throws IOException {

        File f1 = new File("../java_practicle/src/Exeption_Handling_JM/Rohan.txt");

        // true = append mode
        FileWriter fw = new FileWriter(f1, true);

        String data = "\nHello Students";

        fw.write(data);
        fw.append('\n');
        fw.append('J');

        fw.close();

        System.out.println("\nData Written Successfully...");
    }
}

public class Throws_ex {

    public static void main(String[] args) {

        Hello2 ob = new Hello2();

        try {

            // Read existing file
            ob.display();

            // Write new data
            ob.writecode();

            // Read file again after writing
            System.out.println("\n----- Updated File Content -----");
            ob.display();

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found: " + e);

        } catch (IOException e) {

            System.out.println("IOException: " + e);

        } catch (Exception e) {

            System.out.println("Exception: " + e);

        }

    }
}