package ch08_utility_classes;

import java.util.Arrays;
import java.util.List;

public class MyArrayExam {
    public static void main(String[] args) {
        String[] arr1 = new String[3];
        Arrays.fill(arr1, "너부리");
        printArray(arr1);

        Arrays.fill(arr1, 1, 3, "양너불");
        printArray(arr1);

        Arrays.fill(arr1, 2, 3, "동그랑땡");
        printArray(arr1);

        String[] arr2 = {"예지", "유나", "류진", "채령"};
        String[] arr3 = {"예지", "유나", "류진", "채령", "리아"};

        System.out.println("배열 1과 2가 동일하뉘?");
        System.out.println(Arrays.equals(arr2, arr3));

        System.out.println("배열 1과 3가 동일하뉘?");
        System.out.println(Arrays.equals(arr1, arr3));

        Arrays.sort(arr3);
        printArray(arr3);

        System.out.println("binarySearch는 우선 정렬이 되어야 한다.");
        String finddata = "류진";
        int idx = Arrays.binarySearch(arr3, finddata);
        System.out.println(finddata + "의 인덱스 : " + idx);


        // asList 메소드는 배열을 리스트 형식으로 만들어준다.
        // 리스트는 순서가 있는 자료 구조
        String[] arr4 = {"김", "나", "박", "이"};
        List<String> lists = Arrays.asList(arr4);
//        for(데이터타입 개별이름 : 복수를지칭칭){
        for(String str : lists){
            System.out.println(str + "씨");
        }
        System.out.println("copyOf를 이용한 배열 복사");
        String[] arr5 = {"탄지로", "네즈코", "젠이츠", "이노스케", "겐야"};
        for (int i = 1; i <= 10; i++) {
            String arr6[] = Arrays.copyOf(arr5, i);
            printArray(arr6);
        }

        System.out.println("copyOfRange를 이용한 배열의 특정 색인만 복사");
        String[] arr7 = Arrays.copyOfRange(arr5, 1, 4);
        printArray(arr7);

        Arrays.sort(arr5);
        printArray(arr5);

        String[] arr8 = {"나", "가", "아", "다", "라"};
        Arrays.sort(arr8, 1, 4);
        printArray(arr8);

        System.out.println(Arrays.toString(arr5));
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
