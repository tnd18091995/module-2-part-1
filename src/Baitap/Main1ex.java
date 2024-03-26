package Baitap;

public class Main1ex {
    static public int X = 2;

    public static void main(String[] args) {
        Main1ex o1 = new Main1ex();
        Main1ex o2 = new Main1ex();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, Main1ex.X);
    }
}