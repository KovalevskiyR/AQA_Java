package Lesson7;

import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public static void read(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String csv_file = reader.readLine();
        while (csv_file != null) {
            String[] arr = csv_file.split(" ");
            System.out.println(Arrays.toString(arr));
            csv_file = reader.readLine();
        }
    }

    public static void save(AppData object, File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (int x = 0; x < object.header.length; x++) {
            if (x < object.header.length - 1)
                writer.write(object.header[x] + ";");
            else {
                writer.write(object.header[x]);
            }
        }
        for (int i = 0; i < object.data.length; i++) {
            writer.write("\n");
            for (int j = 0; j < object.data.length; j++) {
                writer.write(object.data[i][j] + ";");
            }
        }
        writer.close();
    }
}

