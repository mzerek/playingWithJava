package mzerek.liczbypierwsze;

import java.util.HashSet;
import java.util.Set;

public class MainLiczbyPierwsze {

    public static void main(String[] str) {
        int n = 25;
        Set<Integer> values = new HashSet<>();
        for(int i = 0; i < n; i++){
            values.add(i + 1);
        }
        values.forEach(System.out::println);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int t = i + i; t < n + 1; t = t + i) {
                //System.out.println("t: " + t);
                if(values.contains(t)){
                    values.remove(t);
                }
            }
        }

        values.forEach(System.out::println);
    }
}
