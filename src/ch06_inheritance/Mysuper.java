package ch06_inheritance;

public class Mysuper {
    int x = 100;
    private String hello = "안녕하세요.";

    public void sayHello(String name){
        String message = this.hello + " " + name + "님!";
        System.out.println(message);
    }
}
