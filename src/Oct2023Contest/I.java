package Oct2023Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;


public class I {
    public StringBuilder sb = new StringBuilder();
    public static Set<String> visited = new HashSet<>();
    public static Map<String, ArrayList<String>> edges = new HashMap<>();
    public static List<String> res = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\kdkul\\Github\\ContestProblems\\src\\Oct2023Contest\\the_input.txt");
        Scanner scan = new Scanner(file);
        //Reminder use scan.nextLine
        while (scan.hasNextLine()) {
            visited = new HashSet<>();
            int n = Integer.parseInt(scan.nextLine());
            String[] allNames = scan.nextLine().split(" ");
            for(String s : allNames) edges.put(s, new ArrayList<>());
            //System.out.println(edges.toString());

            for (int i = 0; i < n; i++) {
                String[] edgesForAStudent = scan.nextLine().split(" ");
                String receivingStudent = edgesForAStudent[0];
                for(int j = 1; j < edgesForAStudent.length; j++) {
                    ArrayList<String> list = edges.get(edgesForAStudent[j]);
                    list.add(receivingStudent);
                    edges.put(edgesForAStudent[j], list);
                }
            }
            res = new ArrayList<>();
            Arrays.sort(allNames, Collections.reverseOrder());
            for (String name : allNames) {
                visited.add(name);
                dfs(name);
            }

            Set<String> cum = new HashSet<>();
            for (String s : res) {
                cum.add(s);
            }

            ArrayList<String> array = new ArrayList<>(cum);
            Collections.sort(array);

            for (int i = 0; i < array.size(); i++) {
                if (i == array.size()-1) {
                    p(array.get(i));

                } else {
                    p(array.get(i) + " ");

                }
            }

            pln("");

        }
    }

    public static void dfs(String currStudent) {
        List<String> nextStudents = edges.get(currStudent);
        boolean isTheEnd = true;
        for (String nextStudent : nextStudents) {
            isTheEnd = false;
            if (visited.contains(nextStudent)) continue;
            visited.add(nextStudent);
            dfs(nextStudent);
        }
        if (isTheEnd) res.add(currStudent);
    }


    public static void p(String s) {
        System.out.print(s);
    }

    public static void pln(String s) {
        System.out.println(s);
    }
}
