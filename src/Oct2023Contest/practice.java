package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class practice {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        while(scan.hasNextLine()) {
            int i = Integer.parseInt(scan.nextLine());
            if (i == 0) {
                continue;
            } else if (i % 2 == 0){
                pln("The number " + i + " is EVEN.");
            } else {
                pln("The number " + i + " is ODD.");
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
