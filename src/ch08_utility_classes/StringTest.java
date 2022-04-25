package ch08_utility_classes;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("SEOUL");
        String str2 = new String("korea");

        String stemp;
        stemp = str1.toLowerCase() + " " + str2.toUpperCase();
        System.out.println(stemp);

        StringBuffer sb = new StringBuffer(stemp);
        System.out.println(sb.reverse());

        StringBuffer str3 = new StringBuffer("abcd");
        System.out.println(str3);
        System.out.println(str3.insert(2, "xx"));
        System.out.println(str3.delete(3, 5));
        System.out.println(str3.reverse());

        String str4 = "대한민국";
        String str5 = "화이팅";
        System.out.println(str4.concat(str5));  //concat 메소드는 문자열 결합

        String somefile = "b.ppt";
        System.out.println(".ppt 로 끝이 나는지 체크 : " + somefile.endsWith(".ppt"));  //endwith 는 특정단어로 끝이 나는지 판단할 때 사용
        System.out.println("a.으로 시작하는지 체크 : " + somefile.startsWith("a."));    //startwith는 특정단어로 시작하는지 판단할 때 사용

        String files = "a.XLS/b.ppt/c.doc/d.xls";
        String[] filename = files.split("/");   //split 메소드는 구분자를 사용하여 나눈 다음, 배열 형태로 생성
        for (int i = 0; i < filename.length; i++) {
            if(filename[i].toLowerCase().endsWith(".ppt")){
                System.out.println(filename[i] + "는(은) 피피티 파일입니다.");
            }
            else if(filename[i].toLowerCase().endsWith(".xls")){
                System.out.println(filename[i] + "는(은) 엑셀 파일입니다.");
            }
            else if(filename[i].toLowerCase().endsWith(".doc")){
                System.out.println(filename[i] + "는(은) 워드 파일입니다.");
            }
        }
    }
}
