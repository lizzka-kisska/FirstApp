import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_METHOD;

public class FunnyTests {
    int count = 0;

    @Test
    public void testInc1(){
        System.out.println(count++);
    }

    @Test
    public void testInc2(){
        System.out.println(count++);
    }

    @Test
    public void testInc3(){
        System.out.println(count++);
    }
}