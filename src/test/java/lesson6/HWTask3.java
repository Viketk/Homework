package test.java.lesson6;
import main.java.HW.Task3;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertEquals;

public class HWTask3 {
    @Test
    public void reversRow () {
        Task3 task3 = new Task3();
        String a = "Vika";
        String expectedRow = "akiV";
        String actualRow = task3.reverse(a);
        assertEquals(expectedRow,actualRow);

    }

}
