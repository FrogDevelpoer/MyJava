package ch08_utility_classes;

public class CharactorExam {
    public static void main(String[] args) {
        String str = "Worldcup2002";
        char munja = str.charAt(5);
        System.out.println("문자 : " + munja);

        System.out.println("숫자 여부 : " + Character.isDigit(munja));
        System.out.println("문자 여부 : " + Character.isLetter(munja));
        System.out.println("숫자/문자 여부 : " + Character.isLetterOrDigit(munja));
        System.out.println("소문자 여부 : " + Character.isLowerCase(munja));
        System.out.println("공백 여부 : " + Character.isSpaceChar(munja));
        System.out.println("대문자 여부 : " + Character.isUpperCase(munja));
        System.out.println("대문자로 변경 : " + Character.toUpperCase(munja));
    }
}
