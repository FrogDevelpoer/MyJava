package ch04_method;

public class RandomNum {
    public static void main(String[] args) {
        int result;

        for(int i = 0; i < 3; i++){
            result = random(5, 9);
            System.out.println(result);
        }
        }
    static int random(int x, int y){
        int result = (int)((y - x) * Math.random() + x);
        return result;
    }
}
