package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class C {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {

        }
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
