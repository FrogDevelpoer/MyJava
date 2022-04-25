package ch07_abstract.sports;

public class Sports {
    private String name;
    private int entry;

    public Sports(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    public void Display() {
    }

    public String getName() {
        return name;
    }

    public int getEntry() {
        return entry;
    }

    protected void getInfo() {
        System.out.println("종목 : " + this.name);
        System.out.println("엔트리 : " + this.entry);
    }
}
