package main.java.HW;

public class Task3 {


       public   String reverse (String input) {

            String output= "";
            for (int i = input.length() - 1;  i>=0; i--)  {
                output = output + input.charAt(i);
            }
            return output;
        }
    }



