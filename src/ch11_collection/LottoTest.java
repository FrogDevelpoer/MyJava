package ch11_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTest {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>();
        Random rand = new Random();

        int secondnum = 0;  // 2등 번호 저장 변수
        while(lotto.size() < 7){
            int su = rand.nextInt(45) + 1;
            if(lotto.size() == 6){
                secondnum = su;
            }
            lotto.add(su);
        }
        lotto.remove(secondnum);

        Object[] obj = lotto.toArray();
        Arrays.sort(obj);

        System.out.println("1등 번호 : ");
        for(Object number : obj){
            System.out.print(number.toString() + " ");
        }
        System.out.println("입니다.");
        System.out.println("2등 번호는 " + secondnum + "입니다.");
    }
}
