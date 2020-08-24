package main.java.HW;

public class Task4 {


    public int min(int a, int b, int c) {
        if (a<b && a<c) {
            return a;
        }
        else if  (b<a && b<c) {
            return b;
        }
        else {
            return c;
        }
    }
}

