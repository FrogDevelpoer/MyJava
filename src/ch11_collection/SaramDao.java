package ch11_collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaramDao {
    private Map<String, String> map = new HashMap<String, String>() ;

    public SaramDao() {
        map.put("O", "오형");
        map.put("A", "에이형");
        map.put("B", "비형");
        map.put("AB", "에이비형");
    }

    public void ShowData(List<Saram> lists) {
        System.out.println("목록을 출력합니다.");
        System.out.println("이름\t키\t몸무게\t취미\t혈액형\t장단신\t한글이름");
        for(Saram bean:lists){
            String name = bean.getName() ;
            double height = bean.getHeight() ;
            double weight = bean.getWeight() ;
            String hobby = bean.getHobby() ;
            String blood = bean.getBlood() ;

            String remark01 = "" ;
            String remark02= "" ;
            if (height >= 170.0){
                remark01 = "장신" ;
            }else{
                remark01 = "단신" ;
            }
            remark02 = this.map.get(blood) ;

            String imsi = name + "\t" + height + "\t" + weight + "\t" + hobby + "\t" + blood + "\t" + remark01 + "\t" + remark02  ;
            System.out.println(imsi);
        }
    }
}
