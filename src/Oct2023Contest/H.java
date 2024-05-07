package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class H {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        while (scan.hasNextLine()) {
            Long num = Long.parseLong(scan.nextLine());
            char[] array = Long.toBinaryString(num).toCharArray();
            //pln(Arrays.toString(array));

            int i = 0;
            int count = 0;
            while (i < array.length-2) {
                char a = array[i];

                //add out of bounds check for b and c
                char b = array[i+1];
                char c = array[i+2];

                if (a == '1' && b == '1' && c == '0') {
                    count++;
                    i = i +3;
                } else {
                    i++;
                }

            }

            if (count == 3) {
                pln("SPOOKY");
            } else {
                pln("MEH");
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
