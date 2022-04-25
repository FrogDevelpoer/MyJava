package ch02_control_statement;
/*
    반복문 : 특정 영역의 문장을 반복적으로 수행하기 위한 구문
    사용 형식
        for(초기식; 조건식; 증감식;){
            todolist...
        }
        초기식 : 최초 딱 1번 실행되는 수식
        조건식 : 비교/판단을 위한 근거가 되는 수식
        증감식 : 제어 변수 증가/감소를 위한 수식
        제어 변수 : 반복문 실행시 수시로 값이 변하는 변수
    1부터 10까지의 총합
        1부터 시작하여 1씩 커지면서 10까지 진행
        초기식 : int i = 1
        증감식 : i += 1   i++
        조건식 : i <= 10 또는 i < 11
 */

public class For01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        //1 + 4 + 7 + ... + 100 = 1717
        //초기식 : int i = 1
        //조건식 : i < 101
        //증감식 : i += 3
        for(int i = 1; i < 101; i +=3){
            sum += i;
        }
        System.out.println(sum);

        // 97 + 92 + 87 + ... + 2 = 990
        sum = 0;
        for(int i = 97; i > 1; i -= 5 ){
            sum += i;
        }
        System.out.println(sum);

        //1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        sum = 0;
        for(int i = 1; i < 100; i += 5){
            sum += i*i;
        }
        System.out.println(sum);
    }
}
