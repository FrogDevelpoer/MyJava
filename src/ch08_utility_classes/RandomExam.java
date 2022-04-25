package ch08_utility_classes;

import java.util.Random;

public class RandomExam {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dice = new int[3];
        int repeat = 10; // 총 시도 횟수
        boolean flag = false;   // 프로그래밍에서 flag는 판단 기준. 주사위 3 눈금이 모두 같다면 true가 됨.
        int what = 0;   // 몇 번째 맞췄는지
        int hitnumber = 0; // 3개 모두 동일한 주사위 눈금 번호(1~6)

        for(int i = 1; i <= repeat; i++){
            for (int j = 0; j < dice.length; j++) {
                dice[j] = random.nextInt(6) + 1;
                System.out.print(dice[j] + "\t");
            }
            System.out.println();
            if(dice[0] == dice[1]){
                if(dice[0] == dice[2]) {
                    if (dice[0] == 5) {
                        System.out.println(i + "번째 시도에서 5나와서 안됨 ㅋㅋ 어림도 없지 ㅋㅋ");
                    } else {
                        hitnumber = dice[0];
                        what = i;
                        flag = true;
                        break;
                    }
                }
            }
        }

        if(flag == true){
            String imsi = "%d번째 시도에서 모두 %d(이)가 나옴!\n";
            System.out.printf(imsi, what, hitnumber);
        }
        else{
            System.out.println(repeat + "번 시도했지만 실패!");
        }
    }
}
