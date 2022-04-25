package ch03_array;

public class Exam6_2 {
    public static void main(String[] args) {
        int []a = new int[5];
        for(int i = 0; i < a.length; i++){
            a[i] = a.length - i;
            System.out.println("array[" + i + "] = "  + a[i]);
        }
        System.out.println();

        int []b = new int[5];
        for(int i =0; i < b.length; i++){
            b[i] = 3 * i + 1;
            System.out.println("array2[" + i + "] = "  + b[i]);
        }
        System.out.println();

        int []c = new int[5];
        for(int i = 0; i < c.length; i++){
            c[i] = 17 - 4 * i;
            System.out.println("array3[" + i + "] = "  + c[i]);
        }
        System.out.println();

        int []d = new int[5];
        for(int i = 0; i < d.length; i++){
            d[i] = 4 * i + 3;
            System.out.println("array3[" + i + "] = "  + d[i]);
        }
    }
}
