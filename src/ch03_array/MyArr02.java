package ch03_array;

public class MyArr02 {
    public static void main(String[] args) {
        int[]a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        for(int i = 0; i < a.length; i++){
            a[i] = 10 * (i + 1);
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        int b[] = new int[95/5 + 1];
        for(int i = 0; i < b.length; i++){
            b[i] = 5 * i + 3;
            System.out.print(b[i] + "\t");
        }
        System.out.println();
        int c[] = new int[92/10+1];
        for(int i = 0; i < c.length; i++){
            c[i] = 92 - 10 * i;
            System.out.print(c[i] + "\t");
        }
    }
}
