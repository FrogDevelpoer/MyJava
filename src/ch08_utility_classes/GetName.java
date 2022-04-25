package ch08_utility_classes;

public class GetName {
    public static void main(String[] args) {
        // target 문자열에 what 문자열이 몇번 들어있는지
        final String what = "빡";
        String target = "빡빡이빡빡이이이이빡빡빡";
        System.out.println("문자열 원본 : " + target);

        int cnt = 0; // 발견 카운터 변수
        int idx = 0; // what 문자열이 발견된 위치(인덱스)
        int len = what.length(); // 찾고자하는 문자열의 길이

        while(true){
            idx = target.indexOf(what);
            if(idx == -1){
                String imsi = "\'%s\'는(은) 더 이상 존재하지 않습니다.\n";
                System.out.printf(imsi, what);
                break;
            }
            else{
                target = target.substring(idx + len);
                System.out.println("새로 추출된 문자열 : " + target);
                cnt++;
            }

        }
        String message = "문자열 \'%s\'는(은) %d번 발견되었습니다.\n";
        System.out.printf(message, what, cnt);
    }
}
