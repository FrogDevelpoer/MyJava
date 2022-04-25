package ch08_utility_classes;
/*
    수학 클래스는 매개 변수 없는 생성자를 구비하고 있지만 private 이므로 외부에서 접근이 불가능.
    모든 변수와 메소드에는 static 키워드를 제공하고 있다.
 */

public class MathEx {
    public static void main(String[] args) {
//        Math math = new Math();   -> 생성자 접근 불가
        double d1 = -12.3456;
        double d2 = 34.56;
        System.out.println("절대값 : " + Math.abs(d1));
        System.out.println("2의 2제곱 : " + Math.sqrt(4.0));   // root
        System.out.println("2의 3제곱 : " + Math.cbrt(8.0));   // root
        System.out.println("올림 : " + Math.ceil(d2));
        System.out.println("버림 : " + Math.floor(d2));
        System.out.println("반올림 : " + Math.round(d2));

        int su01 = 12, su02 = 15;
        System.out.println("큰 수 : " + Math.max(su01, su02));
        System.out.println("작은 수 : " + Math.min(su01, su02));
        System.out.println("2의 10승 : " + Math.pow(2.0, 10.0));
        System.out.println("0이상 1미만의 랜덤 수 : " + Math.random());

        System.out.println("부호(양수) : " + Math.signum(d2));  // 변수의 값이 양수면 1 출력
        System.out.println("부호(음수) : " + Math.signum(d1));  // 변수의 값이 음수면 -1 출력

        // abs 메소드를 사용하지 않고 d1의 절대값 구하기
        System.out.println("abs를 사용하지 않은 절대값: " + Math.signum(d1) * d1);
        // double result = d1 * Math.signum(d1);
        // System.out.println("d1의 절대값 : " + result;

        // 두 변이 3.0, 4.0인 직각 삼각형의 대변의 길이를 구하세요.
        double width = 4.0, height = 3.0;
        double diagonal;  // 정답은 5.0
        diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
        System.out.println("대각선의 길이 : " + diagonal);

        // 대변의 길이가 13, 밑변의 길이가 12인 직각삼각형의 높이는?
        diagonal = 13.0;
        width = 12.0;
        height = Math.sqrt(Math.pow(diagonal, 2.0) - Math.pow(width, 2.0));
        System.out.println("높이 : " + height);

        // 모든 원소 3제곱의 합 구하기. 음수는 절댓값으로 변경
        int[] arr = {3, -5, 4}; // 27 + 125 + 64
        double imsi = 0.0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
            imsi += Math.pow(arr[i], 3.0);
        }
        System.out.println("총합의 결과 : " +  (int)imsi);

        System.out.println("랜덤 수 : " + Math.random());

        int a = 14, b = 5;
        System.out.println("몫 : " + Math.floorDiv(a, b));
        System.out.println("나머지 : " + Math.floorMod(a, b));
    }
}
