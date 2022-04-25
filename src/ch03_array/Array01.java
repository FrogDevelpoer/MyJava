package ch03_array;

public class Array01 {
    public static void main(String[] args) {
        String [] bts = new String[7];
        bts[0] = "RM";
        bts[1] = "진";
        bts[2] = "슈가";
        bts[3] = "제이홉";
        bts[4] = "지민";
        bts[5] = "뷔";
        bts[6] = "정국";

        for(int i = 0; i < bts.length; i++){
            System.out.println(bts[i]);
        }

        String bts2[] = {"RM", "진", "슈가", "제이홉", "지민", "뷔", "정국"};
        for(int i = 0; i < bts2.length; i++){
            System.out.println(bts2[i]);
        }
    }
}
