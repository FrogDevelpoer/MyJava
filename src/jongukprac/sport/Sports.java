package jongukprac.sport;

public abstract class Sports {
    private String name; // 종목 이름
    private int entry; // 총 인원

    public Sports(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public int getEntry() {
        return entry;
    }
    public abstract void Display();

    protected void getInfo() {
        System.out.println("종목 : " + this.name);
        System.out.println("엔트리 : " + this.entry);
    }
}
