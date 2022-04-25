package ch11_collection;

import java.util.Enumeration;
import java.util.Properties;

public class MyProperty {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("id", "bbyong");
        prop.put("name", "뿅뺭");
        prop.put("password", "1234");
        prop.put("address", "금천구 독산동");
        prop.put("zipcode", "12345");



        String id = prop.getProperty("id");
        System.out.println("아이디 : " + id);

        String salary = prop.getProperty("salary", "100");
        System.out.println("급여 : " + salary);

        Integer newsalary = Integer.parseInt(salary) + 20;
        System.out.println("인상된 급여 : " + newsalary);

        // handphone 항목이 있는지 확인하고, 없다면 추가
        if(prop.getProperty("handphone") == null){
            prop.put("handphone", "01012345678");

        }
        // 변수 이름과 프로퍼티 이름이 반드시 동일할 필요는 없다.
        // 다만 혼선을 막기 위하여 일반적으로 동일한 이름을 사용을 권장.
        String hphone = prop.getProperty("handphone");
        System.out.println("핸드폰 : " + hphone);

        Enumeration enu = prop.keys();
        System.out.println("프로퍼티 목록들");
        while(enu.hasMoreElements()){
            Object property = enu.nextElement();
            String value = prop.getProperty((String)property);
            System.out.println(property + "/" + value);
        }
        System.out.println("toString 메소드 : " + prop.toString());

        System.out.println("프로퍼티 개수 : " + prop.size());
    }
}
