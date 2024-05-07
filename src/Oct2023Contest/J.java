package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        StringBuilder sb = new StringBuilder();
        while(scan.hasNextLine()) {
            char[] array = scan.nextLine().toCharArray();

            int i = 0;
            while (i < array.length) {
                if (array[i] != 'o'){
                    sb.append(array[i]);
                    i++;
                } else if (array[i] == 'o' && i+1 < array.length && array[i+1] == 'o') { //check for oo
                    sb.append("oOO");
                    sb.append("oo");
                    i+=2;
                } else { // check for o
                    sb.append("oO");
                    sb.append("o");
                    i++;
                }
            }

            if (scan.hasNextLine()) sb.append('\n');

        }

        pln(sb.toString());
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
