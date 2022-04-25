package ch08_utility_classes;

public class MyCustomString {
    private String sometext;
    public MyCustomString(String sometext) {
        this.sometext = sometext;
    }

    public String mysubstring(int start, int end) {
        return this.sometext.substring(start - 1, end);
    }

    public int mycount(String findtext) {
        int count = 0;
        for (int i = 0; i < this.sometext.length(); i++) {
            if(this.sometext.charAt(i) == findtext.charAt(0)){
                count++;
            }
        }
        return count;
    }

    public String myreverse(int start, int end) {
        String imsi = this.mysubstring(start, end);
        String temp = "";

        for (int i = 0; i < imsi.length(); i++) {
            temp = imsi.charAt(i) + temp;
        }
        return temp;
    }
}
