package ch05_class;

public class MyCreate {
    static String comopany = "Apple";
    private String name;
    private String color;
    private int prise;
    private int storage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    private int date;
}
