package entity;

public class Diploma {

    private int id;
    private String name;

    public Diploma(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Diploma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}