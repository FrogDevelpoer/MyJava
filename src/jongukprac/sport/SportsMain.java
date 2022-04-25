package jongukprac.sport;

public class SportsMain {
    public static void main(String[] args) {
        Sports[] sports =
                {
                        new FootBall("축구", 11, 35),
                        new BaseBall("야구", 9, 0.1)
                };
        for (int i = 0; i < sports.length; i++) {
            sports[i].Display();
        }
    }
}
