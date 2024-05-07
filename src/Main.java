
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\e.in.txt");
        Scanner scan = new Scanner(file);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String names = scan.nextLine();
            String[] array = names.split(" ");
            String startingName = scan.nextLine();
            int jumps = Integer.parseInt(scan.nextLine());
            int currentPersonIndex = 0;

            //find starting
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(startingName)) {
                    currentPersonIndex = j;
                    break;
                }
            }

//            //Iterative solution

//            while (jumps > 1) {
//                currentPersonIndex++;
//                if (currentPersonIndex == array.length) {
//                    currentPersonIndex = 0;
//                }
//                jumps--;
//            }


        }
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
