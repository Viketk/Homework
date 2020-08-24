package test.java.lesson6;
import main.java.HW.Task2;
import main.java.HW.Task4;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HWTask4 {
    @Test
    public void minimum(){
        Task4 task4 = new Task4();
        int result = task4.min(5,2,3);
        int expected = 2;
        assertEquals(expected,result);



    }

}
