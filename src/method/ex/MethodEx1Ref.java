package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15, 25, 35));
    }

    public static double average(final int a, final int b, final int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
