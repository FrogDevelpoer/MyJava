package jongukprac;

public class Exam6_2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;
            System.out.println("arr[" + i + "] =" + a[i]);
        }
        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = 3 * i + 1;
            System.out.println("arr2[" + i + "] = " + b[i]);
        }
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = 17 - 4 * i;
            System.out.println("arr3[" + i + "] = " + c[i]);
        }
        int[] d = new int[5];
        for (int i = 0; i < d.length; i++) {
            d[i] = 4 * i + 3;
            System.out.println("arr4[" + i + "] = " + d[i]);
        }
    }
}
