package test.java.lesson6;
import main.java.HW.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HWTask2 {
 @Test
    public void test2() {
        Task2 task2 = new Task2();
        String result = task2.getR();
      int  expected = 5;
      int actual = result.split("\n").length;
      assertEquals(actual,expected);
  }
  @Test
    public void test2_0(){
        Task2 task2 = new Task2();
        String result = task2.getR();
        String rows []=result.split("\n");
        for (String row:rows){
            int  expected2 = 10;
            int actual2 = row.split(" ").length;
            assertEquals(actual2,expected2);
        }


    }
}
