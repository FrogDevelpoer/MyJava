package ch07_abstract.sports;

public class SportMain {
    public static void main(String[] args) {
        Sports[] sports =
                {
                        new FootBall("축구", 11, 25),
                        new BaseBall("야구", 9, 2.84)
                };
        for (int i = 0; i < sports.length; i++) {
            sports[i].Display();
            System.out.println();
        }
    }
}
