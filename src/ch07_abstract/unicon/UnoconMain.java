package ch07_abstract.unicon;

public class UnoconMain {
    public static void main(String[] args) {


        Unicon unidol = new Unicon("유니돌", "M");
        unidol.Display();
        System.out.println();
        Unicon unisoon = new Unicon("유니순", "F");
        unisoon.Display();
    }
}
