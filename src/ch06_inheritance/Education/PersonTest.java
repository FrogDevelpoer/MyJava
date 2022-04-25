package ch06_inheritance.Education;

public class PersonTest {
    public static void main(String[] args) {
        Person[] person = {
                new Student("김철수", 30, "마포 공덕", "01011111111", 3, 2, "A"),
                new Teacher("박영희", 40, "금천 가산", "01022222222", 2, "자바"),
                new Staff("최직원", 50, "금천 독산", "01033333333", 1, "총무 부서")
        };
        for(int i = 0; i < person.length; i++){
            System.out.println();
            System.out.println(person[i]);
        }
    }
}
