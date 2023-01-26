package Test_2;

import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass {

    int x = 46;  /** ← Введите число */

    @Test
    public void testGetClassNumber(){
        System.out.println(check());
    }
}
