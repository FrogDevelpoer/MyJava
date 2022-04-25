package ch07_abstract.sports;

public class FootBall extends Sports{
    private int goal;

    public FootBall(String name, int entry, int goal) {
        super(name, entry);
        this.goal = goal;
    }

    @Override
    public void Display() {
        super.getInfo();
        System.out.println("골 수 : " + this.goal);
    }
}
