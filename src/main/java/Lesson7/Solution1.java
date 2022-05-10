package Lesson7;

import java.io.*;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/Lesson7/file.csv");
        AppData data = new AppData
                (new String[]{"Header1", "Header2", "Header3"}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        AppData.save(data, file);
        AppData.read(file);
    }
}
