package ch11_collection;

public class ExtendFor {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50};

        for(int item : arr){
            System.out.println(item);
        }

        String fruits[] = new String[]{"apple", "melon", "orange"};
        for(String item : fruits){
            System.out.println(item);
        }
    }
}
