package Lesson13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    int a;
    int b;
    int c;

    @Before
    public void setUp(){
        a = 5;
        b = 6;
        c = 8;
    }

    @Test
    public void TestSquare(){
        double result = 14.981238266578634;
        Assert.assertEquals(result, Triangle.triangleSquare(a, b, c ), 0.0f);
    }
}