package ch04_method;

public class EqualArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 50};
        int[] arr2 = {10, 20, 30, 50};
        boolean result;
        result = isEqual(arr1, arr2);
        System.out.println("결과 : " + result);

    }
    static boolean isEqual(int[] arr1, int [] arr2){
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;
        if(arr1_len != arr2_len){
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
        else{
            boolean flag = true;  // 모든 요소의 값이 동일함
            for (int i = 0; i < arr1_len; i++) {
                if(arr1[i] != arr2[i]){
                    System.out.println(i +"번째 요소의 값이 다릅니다.");
                    flag = false;
                    break;    //이후 내용은 확인 할 필요가 없으므로 빠져나감.
                }
            }
            if(flag == true){
                System.out.println("배열이 일치합니다.");
            }
            return flag;
        }
        return false;
    }

    }

/*
    1번 문제 : 첫번째 배열과 두번째 배열의 길이을 비교하여, 다르면 프로그램을 종료.
    flag변수는 참 거짓을 판단하기 위한 변수
    flag 변수의 기본값을 true라고 가정.
    길이가 동일하다면 반복문 사용하여
        i번째 요소들을 비교하여 같으면 값이 다르면
            flag = false로 변경
            break 구문으로 빠져 나오기.
        값이 동일하면
            내용 없음
 */