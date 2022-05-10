package Lesson8.Solution1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountElements {
    public static void count(String[] arr) {
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(arr));
        for (String key : uniqueSet) {
            System.out.println(key + ": " + Collections.frequency(Arrays.asList(arr), key));
        }
    }
}
