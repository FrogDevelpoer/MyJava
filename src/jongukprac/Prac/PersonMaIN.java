package jongukprac.Prac;

public class PersonMaIN {
    public static void main(String[] args) {
       Person[] person = {
               new Student("김철수", 30, "마포 공덕", "01035112222", 3, 2, "A"),
               new Teacher("박영희", 40, "용산 도원동", "01035116666", 2, "웹프로그래밍"),
               new Staff("최직원", 50, "구로 가리봉동", "01035119999", 1, "총무 부서")
       };
       for(int i = 0; i < person.length; i++){
           System.out.println();
           System.out.println(person[i]);
       }
    }
}
