package Lesson11;

import java.util.Random;

public class GetRandomDigitUtil {
    public static int getRandomInt(){
        Random r = new Random();
        int x = r.nextInt();
        return x;
    }
}
