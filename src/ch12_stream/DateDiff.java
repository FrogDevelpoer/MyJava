package ch12_stream;

import java.text.DecimalFormat;

public class DateDiff {
    int syear;  // 시작 년도
    int eyear;  // 끝 년도
    int smonth; // 시작 월
    int emonth; // 끝 월
    int period = 0; // 몇 개월인가?
    public DateDiff(String startdate, String enddate) {
        syear = Integer.parseInt(startdate.substring(0, 4));
        smonth = Integer.parseInt(startdate.substring(4));

        eyear = Integer.parseInt(enddate.substring(0, 4));
        emonth = Integer.parseInt(enddate.substring(4));

        // 시작 월이 끝 월보다 큰 경우, 끝 년도에는 1을 빼고, 끝 월은 12를 더해준다.
        // 산수 뺄셈 원래와 유사한 개념
        if(smonth > emonth){
            eyear -= 1;
            emonth += 12;
        }
        period = (eyear - syear) * 12 + (emonth - smonth) + 1;
        System.out.println("개월 수 : " + period);
    }


    public String[] calc() {
        // 각 년월에 해당하는 문자열을 저장해주는 배열 생성
        String[] arr = new String[period];

        // 임시 변수를 사용하고 원본을 보존
        int imsiyear = syear;
        int imsimonth = smonth;

        for (int i = 0; i < arr.length; i++) {
            if(imsimonth == 13){
                imsiyear += 1;
                imsimonth = 1;
            }
            arr[i] = String.valueOf(imsiyear) + new DecimalFormat("00").format(imsimonth);
            imsimonth++;
        }
        return arr;
    }
}
