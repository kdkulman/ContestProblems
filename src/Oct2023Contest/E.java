package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class E {
    public StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        while (scan.hasNextLine()) {
            int n = Integer.parseInt(scan.nextLine());
            int[] witch = new int[n];
            int[] broom = new int[n];
            String[] wNums = scan.nextLine().split(" ");
            String[] bNums = scan.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                witch[i] = Integer.parseInt(wNums[i]);
            }
            for (int i = 0; i < n; i++) {
                broom[i] = Integer.parseInt(bNums[i]);
            }
            Arrays.sort(witch);
            Arrays.sort(broom);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs(witch[i] - broom[i]);
            }
            System.out.println(sum);
        }
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
