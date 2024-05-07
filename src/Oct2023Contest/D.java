package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class D {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine

        while (scan.hasNextLine()) {
            String[] array = scan.nextLine().split(" ");
            int n = Integer.parseInt(array[0]);
            int m = Integer.parseInt(array[1]);
            int x = Integer.parseInt(array[2]);
            int y = Integer.parseInt(array[3]);
//            pln("" + n);
//            pln("" + m);
//            pln("" + x);
//            pln( "" + y);

            if (n/3 < x && x < 2*n/3 && m/3 < y && y < 2*m/3) {
                pln("GOOD");
            } else {
                pln("BAD");
            }

        }
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
