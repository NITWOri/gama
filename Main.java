import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Integer.min;

public class Main {

    static int fl = 0, size;

    public static void main (String[] args) {
        try {

            File file1 = new File("D:/Files/ex1.txt");
            File file2 = new File("D:/Files/ex2.txt");

            Scanner sc = new Scanner(file1);
            Scanner scan = new Scanner(file2);

            String line1 = "";
            String line2 = "";

            while (sc.hasNext() && scan.hasNext()) {

                line1 += sc.next();
                line2 += scan.next();
            }

            size = min(line1.length(), line2.length());

            for (int i = 0; i < size; i++){

                if (line1.charAt(i) != line2.charAt(i)){

                    fl = 1;
                    System.out.println(i + 1 + " " + line1.charAt(i) + " " + line2.charAt(i) + " \n");
                }
            }

            if (size < line1.length()) fl = 2;

            else if (size < line2.length()) fl = 3;

            sc.close();

            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }

        if (fl == 0) {

            System.out.println("файлы одинаковы");
        }
        else if (fl == 2) System.out.println("файл №2 закончился");

        else if (fl == 3) System.out.println("файлы №1 закончился");
    }
}