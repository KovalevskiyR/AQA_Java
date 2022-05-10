package Lesson8.Solution1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueElement {
    public static void find(String [] arr){
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqueSet);
    }
}
