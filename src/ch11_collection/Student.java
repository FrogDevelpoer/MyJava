package ch11_collection;
// Comparable 인터페이스는 객체 간의 비교를 위해 제공해주는 인터페이스
//
public class Student implements Comparable<Student>{
    private int number;     // 학번
    private String name;    // 이름

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "(" + number + ")";
    }

    @Override
    public int compareTo(Student target) {
        return this.number - target.number;
    }
}
