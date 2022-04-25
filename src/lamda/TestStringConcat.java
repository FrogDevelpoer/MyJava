package lamda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        StringConcat concat2 = (s, v) -> System.out.println(s + ", " + v);
        concat2.makeString(s1, s2);
    }
}
