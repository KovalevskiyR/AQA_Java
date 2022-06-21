package Lesson13;

public class Triangle{
    public static double triangleSquare(int a, int b, int c){
        double semi_remitter = (a + b + c) / 2.0;
        double square = Math.sqrt(semi_remitter * (semi_remitter - a) * (semi_remitter - b) * (semi_remitter - c ));
        return square;
    }
}
