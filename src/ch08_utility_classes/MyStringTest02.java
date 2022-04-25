package ch08_utility_classes;

public class MyStringTest02 {
    public static void main(String[] args) {
        String sometext = "abcdefghaa";

        MyCustomString mystr = new MyCustomString(sometext);

        String result = mystr.mysubstring(3, 5);
        System.out.println("mysubstring(3, 5) : " + result);

        int count = mystr.mycount("a");
        System.out.println("mycount(\"a\")  : " + count);

        String myrev = mystr.myreverse(3, 5);
        System.out.println("myreverse(3, 5) : " + myrev);

    }
}
