package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class G {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        while (scan.hasNextLine()) {
            String[] as = scan.nextLine().split(" ");
            int a = Integer.parseInt(as[0]);
            int b = Integer.parseInt(as[1]);
//            pln("" + a);
//            pln("" + b);



            Set<Integer> set = new HashSet<>();
            int kidIndex = 1;
            int taps = 0;
            while (set.size() < a - 1) {
                if (taps == b && !set.contains(kidIndex)) { // we kill the kid
                    set.add(kidIndex);
                    taps = 0;
                    continue;
                }

                if (set.contains(kidIndex)) { //if this kid is dead we skip
                    kidIndex++;
                    if (kidIndex > a) kidIndex = 1;
                    continue;
                }

                //if kid is alive, we tap
                if (!set.contains(kidIndex)) {
                    taps++; //taps keep track of taps until death
                    kidIndex++; //kid index keeps track of the ith kid
                    if (kidIndex > a) kidIndex = 1;
                }
            }

            for (int i = 1; i <= a; i++) {
                if (!set.contains(i)) {
                    int r = i+1;
                    System.out.println("" + r);
                }
            }
        }
    }
}
